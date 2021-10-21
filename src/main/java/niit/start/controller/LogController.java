package niit.start.controller;

import lombok.extern.slf4j.Slf4j;
import niit.start.entity.Log;
import niit.start.entity.VList;
import niit.start.repository.VListRepository;
import niit.start.util.RemoteExecutor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/log")
public class LogController {
    @Resource
    private VListRepository VListRepository;

    @GetMapping("/generate")
    @ResponseBody
    public boolean generateLog(@RequestParam int number) {
        List<VList> list;
        list = VListRepository.findAll();
        String[] city = {"上海", "广东", "北京", "江苏", "浙江"};
        int size = list.size();
        int length = city.length;
        Random random = new Random();
        boolean res = false;
        try {
            for (int i = 0; i < number; i++) {
                int t1 = random.nextInt(size);
                int t2 = random.nextInt(length);
                log.info("{}:{} from {}", list.get(t1).getAuthor(), list.get(t1).getBvid(), city[t2]);
            }
            res = true;
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return res;
    }

    @PostMapping("/add")
    @ResponseBody
    public void addLog(@RequestBody Log logItem) {
        String author = logItem.getAuthor();
        String bvid = logItem.getBvid();
        String loc = logItem.getLocation().split(" ")[0];
        log.info("{}:{} from {}", author, bvid, loc);
    }

    @RequestMapping("/ls")
    @ResponseBody
    public String ls(HttpServletRequest request, HttpServletResponse response, String path) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String result = RemoteExecutor.getInstance().execute("ls " + path);
        return result;
    }

    @RequestMapping("/dfsls")
    @ResponseBody
    public String dfsLs(HttpServletRequest request, HttpServletResponse response, String path) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String result = RemoteExecutor.getInstance().execute("hdfs dfs -ls " + path);
        return result;
    }

    @RequestMapping("/flume")
    @ResponseBody
    public boolean flumeToHdFS(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String execResultStr = RemoteExecutor.getInstance().execute("/opt/pkg/flume/bin/flume-ng agent -f /opt/pkg/flume/conf/log2hdfs.conf -n a1 -Dflume.root.logger=INFO,console");
        return !"".equals(execResultStr);
    }

    @RequestMapping("/mapred")
    @ResponseBody
    public boolean MapReduce(HttpServletRequest request, HttpServletResponse response, String input) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd");
        String date = df.format(new Date());
        String output = "/project/output/" + date;
        String cmd = "hadoop jar /opt/data/project/mapred.jar log.LogJobMain " + input + " " + output;
        String execResultStr = RemoteExecutor.getInstance().execute(cmd);
        return !"".equals(execResultStr);
    }

    @RequestMapping("/sqoop")
    @ResponseBody
    public boolean sqoopToMysql(HttpServletRequest request, HttpServletResponse response, String path) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String cmd = "sqoop export --connect 'jdbc:mysql://hadoop100:3306/ten?useUnicode=true&characterEncoding=utf-8' --username root --password niit1234 --table mapred --export-dir " + path + " --columns 'name,type,count,tm' --mapreduce-job-name 'hdfs to mysql' --input-fields-terminated-by '\\t' --input-lines-terminated-by '\\n'";
        String execResultStr = RemoteExecutor.getInstance().execute(cmd);
        return !"".equals(execResultStr);
    }
}

package niit.start.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("api")
public class LogController {

    @RequestMapping("/ls")
    @ResponseBody
    public String ls(HttpServletRequest request, HttpServletResponse response, String path) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String result = RemoteExecutor.getInstance().execute("ls " + path);
        return result;
    }

    @RequestMapping("/dfsls")
    @ResponseBody
    public String dfs_ls(HttpServletRequest request, HttpServletResponse response, String path) {
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

package niit.start.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("api")
public class LogController {

    @RequestMapping("/ls")
    @ResponseBody
    public boolean ls(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String execResultStr = RemoteExecutor.getInstance().execute("ls");
        return !"".equals(execResultStr);
    }

    @RequestMapping("/flume")
    @ResponseBody
    public boolean flumeToHdFS(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String execResultStr = RemoteExecutor.getInstance().execute("ls");
        return !"".equals(execResultStr);
    }

    @RequestMapping("/mapred")
    @ResponseBody
    public boolean MapReduce(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String execResultStr = RemoteExecutor.getInstance().execute("ls");
        return !"".equals(execResultStr);
    }

    @RequestMapping("/sqoop")
    @ResponseBody
    public boolean sqoopToMysql(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String execResultStr = RemoteExecutor.getInstance().execute("ls");
        return !"".equals(execResultStr);
    }
}

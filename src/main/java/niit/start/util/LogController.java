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
    public boolean dataGeneration(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");// 解决跨域问题
        // 使用SSH2登录远程Linux服务器，执行shell脚本
        String execResultStr = RemoteExecutor.getInstance().execute("ls");
        return !"".equals(execResultStr);
    }
}

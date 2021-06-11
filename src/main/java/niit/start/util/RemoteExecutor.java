package niit.start.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.commons.lang.StringUtils;
import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;

public class RemoteExecutor {
    private static String DEFAULTCHARSET = "UTF-8";
    private Connection conn;
    private String ip;
    private String userName;
    private String userPwd;

    public static volatile RemoteExecutor instance;

    private RemoteExecutor() {
        this.ip = "192.168.186.100";
        this.userName = "meru";
        this.userPwd = "niit1234";
    }

    public static RemoteExecutor getInstance() {
        if (instance == null) {
            synchronized (RemoteExecutor.class) {
                if (instance == null) {
                    instance = new RemoteExecutor();
                }
            }
        }
        return instance;
    }

    public Boolean login() {
        boolean flg = false;
        try {
            conn = new Connection(ip);
            conn.connect();// 连接
            flg = conn.authenticateWithPassword(userName, userPwd);// 认证
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flg;
    }

    public String execute(String cmd) {
        String result = "";
        try {
            if (login()) {
                Session session = conn.openSession();// 打开一个会话
                session.execCommand(cmd);// 执行命令
                result = processStdout(session.getStdout(), DEFAULTCHARSET);
                // 如果为得到标准输出为空，说明脚本执行出错了
                if (StringUtils.isBlank(result)) {
                    result = processStdout(session.getStderr(), DEFAULTCHARSET);
                }
                conn.close();
                session.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String executeSuccess(String cmd) {
        String result = "";
        try {
            if (login()) {
                Session session = conn.openSession();// 打开一个会话
                session.execCommand(cmd);// 执行命令
                result = processStdout(session.getStdout(), DEFAULTCHARSET);
                conn.close();
                session.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private String processStdout(InputStream in, String charset) {
        InputStream stdout = new StreamGobbler(in);
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stdout, charset));
            String line = null;
            while ((line = br.readLine()) != null) {
                buffer.append(line + "\n");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    public static void setCharset(String charset) {
        DEFAULTCHARSET = charset;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}

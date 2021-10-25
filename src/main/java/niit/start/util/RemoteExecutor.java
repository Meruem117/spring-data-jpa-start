package niit.start.util;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RemoteExecutor {
    private static String DEFAULT_CHARSET = "UTF-8";
    private Connection conn;
    private String ip;
    private String username;
    private String password;

    public static volatile RemoteExecutor instance;

    private RemoteExecutor() {
        this.ip = "192.168.186.100";
        this.username = "meru";
        this.password = "niit1234";
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
            conn.connect();
            flg = conn.authenticateWithPassword(username, password);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flg;
    }

    public String execute(String cmd) {
        String result = "";
        try {
            if (login()) {
                Session session = conn.openSession();
                session.execCommand(cmd);
                result = processStdout(session.getStdout(), DEFAULT_CHARSET);
                if (StringUtils.isBlank(result)) {
                    result = processStdout(session.getStderr(), DEFAULT_CHARSET);
                }
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
                buffer.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}

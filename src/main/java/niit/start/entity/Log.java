package niit.start.entity;

import java.io.Serializable;

public class Log implements Serializable {
    private static final long serialVersionUID = 3569853174776315537L;

    private String author;
    private String bvid;
    private String location;

    public String getAuthor() {
        return author;
    }

    public String getBvid() {
        return bvid;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Log{" +
                "author='" + author + '\'' +
                ", bvid='" + bvid + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

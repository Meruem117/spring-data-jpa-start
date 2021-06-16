package niit.start.entity.hive;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hr4")
public class HResult4 implements Serializable {
    private static final long serialVersionUID = 1L;// 序列化

    @Column(name = "process_date")
    private String process_date;
    @Column(name = "author")
    private String author;
    @Id
    @Column(name = "bvid")
    private String bvid;
    @Column(name = "title")
    private String title;
    @Column(name = "play")
    private int play;
    @Column(name = "tm")
    private String tm;

    public String getProcess_date() {
        return process_date;
    }

    public String getAuthor() {
        return author;
    }

    public String getBvid() {
        return bvid;
    }

    public String getTitle() {
        return title;
    }

    public int getPlay() {
        return play;
    }

    public String getTm() {
        return tm;
    }
}

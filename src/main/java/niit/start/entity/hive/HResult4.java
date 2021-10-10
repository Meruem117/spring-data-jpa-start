package niit.start.entity.hive;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "hr4")
public class HResult4 implements Serializable {
    private static final long serialVersionUID = -6091481036140257477L;

    @Column(name = "process_date")
    private String processDate;
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

    public String getProcessDate() {
        return processDate;
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

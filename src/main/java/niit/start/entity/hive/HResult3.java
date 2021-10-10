package niit.start.entity.hive;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "hr3")
public class HResult3 implements Serializable {
    private static final long serialVersionUID = -4334774891246390189L;

    @Column(name = "process_date")
    private String processDate;
    @Id
    @Column(name = "bvid")
    private String bvid;
    @Column(name = "mid")
    private String mid;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "pic")
    private String pic;
    @Column(name = "play")
    private int play;
    @Column(name = "review")
    private int review;
    @Column(name = "score")
    private int score;

    public String getProcessDate() {
        return processDate;
    }

    public String getBvid() {
        return bvid;
    }

    public String getMid() {
        return mid;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPic() {
        return pic;
    }

    public int getPlay() {
        return play;
    }

    public int getReview() {
        return review;
    }

    public int getScore() {
        return score;
    }
}

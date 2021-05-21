package niit.start.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "video_list")
public class VList implements Serializable {

    private static final long serialVersionUID = 1L;// 序列化

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "bvid")
    private String bvid;
    @Column(name = "mid")
    private String mid;
    @Column(name = "author")
    private String author;
    @Column(name = "title")
    private String title;
    @Column(name = "pic")
    private String pic;
    @Column(name = "play")
    private int play;
    @Column(name = "review")
    private int review;
    @Column(name = "comment")
    private int comment;
    @Column(name = "length")
    private String length;
    @Column(name = "description")
    private String description;
    @Column(name = "tm")
    private String tm;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBvid() {
        return bvid;
    }

    public void setBvid(String bvid) {
        this.bvid = bvid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }
}

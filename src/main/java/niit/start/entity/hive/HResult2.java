package niit.start.entity.hive;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "hr2")
@IdClass(HResult2Key.class)
public class HResult2 implements Serializable {
    private static final long serialVersionUID = 1L;// 序列化

    @Column(name = "process_date")
    private String process_date;
    @Id
    @Column(name = "author")
    private String author;
    @Id
    @Column(name = "year")
    private String year;
    @Column(name = "video_count")
    private int video_count;

    public String getProcess_date() {
        return process_date;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public int getVideo_count() {
        return video_count;
    }
}

class HResult2Key implements Serializable {
    private String author;
    private String year;
}
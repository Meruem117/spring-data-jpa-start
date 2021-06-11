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
    @Column(name = "tm")
    private String tm;
    @Column(name = "count")
    private int count;

    public String getProcess_date() {
        return process_date;
    }

    public String getAuthor() {
        return author;
    }

    public String getTm() {
        return tm;
    }

    public int getCount() {
        return count;
    }
}

class HResult2Key implements Serializable {
    private String author;
    private String tm;
}
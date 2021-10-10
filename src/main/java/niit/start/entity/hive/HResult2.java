package niit.start.entity.hive;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hr2")
@IdClass(HResult2Key.class)
public class HResult2 implements Serializable {
    private static final long serialVersionUID = -4005845848674131939L;

    @Column(name = "process_date")
    private String processDate;
    @Id
    @Column(name = "author")
    private String author;
    @Id
    @Column(name = "tm")
    private String tm;
    @Column(name = "count")
    private int count;

    public String getProcessDate() {
        return processDate;
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
    private static final long serialVersionUID = -2209363784644651045L;
    private String author;
    private String tm;
}
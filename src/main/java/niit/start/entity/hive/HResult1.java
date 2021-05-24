package niit.start.entity.hive;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hr1")
public class HResult1 implements Serializable {
    private static final long serialVersionUID = 1L;// 序列化

    @Column(name = "process_date")
    private String process_date;
    @Id
    @Column(name = "year")
    private String year;
    @Column(name = "video_count")
    private int video_count;

    public String getProcess_date() {
        return process_date;
    }

    public String getYear() {
        return year;
    }

    public int getVideo_count() {
        return video_count;
    }
}

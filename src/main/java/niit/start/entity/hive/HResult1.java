package niit.start.entity.hive;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "hr1")
public class HResult1 implements Serializable {
    private static final long serialVersionUID = 2778092941375550838L;

    @Column(name = "process_date")
    private String processDate;
    @Id
    @Column(name = "year")
    private String year;
    @Column(name = "video_count")
    private int videoCount;

    public String getProcessDate() {
        return processDate;
    }

    public String getYear() {
        return year;
    }

    public int getVideoCount() {
        return videoCount;
    }
}

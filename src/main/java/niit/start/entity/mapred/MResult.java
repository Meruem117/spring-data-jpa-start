package niit.start.entity.mapred;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "mapred")
public class MResult implements Serializable {
    private static final long serialVersionUID = -5421789665061450820L;

    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private int type;
    @Column(name = "count")
    private int count;
    @Column(name = "tm")
    private String tm;

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public String getTm() {
        return tm;
    }
}

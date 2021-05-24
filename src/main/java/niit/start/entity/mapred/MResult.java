package niit.start.entity.mapred;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mapred")
public class MResult implements Serializable {
    private static final long serialVersionUID = 1L;// 序列化

    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private int type;
    @Column(name = "count")
    private int count;

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public int getCount() {
        return count;
    }
}

package niit.start.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "up")
public class Up implements Serializable {
    private static final long serialVersionUID = 2744246298452003827L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "mid")
    private String mid;
    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Up{" +
                "id=" + id +
                ", mid='" + mid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

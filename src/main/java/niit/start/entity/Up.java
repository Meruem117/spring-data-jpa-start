package niit.start.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "up")
public class Up implements Serializable {

    private static final long serialVersionUID = 1L;// 序列化

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}

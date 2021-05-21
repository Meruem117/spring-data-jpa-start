package niit.start.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "up_list")
public class UList implements Serializable {
    private static final long serialVersionUID = 1L;// 序列化

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "mid")
    private String mid;
    @Column(name = "name")
    private String name;
    @Column(name = "face")
    private String face;
    @Column(name = "gender")
    private String gender;
    @Column(name = "fans")
    private int fans;
    @Column(name = "sign")
    private String sign;
    @Column(name = "title")
    private String title;
    @Column(name = "page")
    private int page;

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

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

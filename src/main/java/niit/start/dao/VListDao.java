package niit.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.bean.VList;

import java.util.List;

public interface VListDao extends JpaRepository<VList, Long> {
    List<VList> getVListByMid(String mid);

    VList getVideoByBvid(String bvid);

}

package niit.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.entity.VList;

import java.util.List;

public interface VListRepository extends JpaRepository<VList, Long> {
    List<VList> getVListByMid(String mid);

    VList getVideoByBvid(String bvid);

}

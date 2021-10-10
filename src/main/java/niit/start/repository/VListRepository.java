package niit.start.repository;

import niit.start.entity.VList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VListRepository extends JpaRepository<VList, Long> {
    List<VList> getVListByMid(String mid);

    VList getVideoByBvid(String bvid);
}

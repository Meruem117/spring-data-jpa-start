package niit.start.repository;

import niit.start.entity.UList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UListRepository extends JpaRepository<UList, Long> {
    UList getUpByMid(String mid);
}

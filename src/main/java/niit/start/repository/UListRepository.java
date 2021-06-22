package niit.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.entity.UList;

public interface UListRepository extends JpaRepository<UList, Long> {
    UList getUpByMid(String mid);
}

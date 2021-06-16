package niit.start.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.entity.Up;

public interface UpDao extends JpaRepository<Up, Long> {

    Up getUpById(int id);

    int deleteById(int id);
}

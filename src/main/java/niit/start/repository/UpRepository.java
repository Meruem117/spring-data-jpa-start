package niit.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.entity.Up;

public interface UpRepository extends JpaRepository<Up, Long> {

    Up getUpById(int id);

    int deleteById(int id);
}

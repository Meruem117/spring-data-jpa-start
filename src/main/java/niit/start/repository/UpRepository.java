package niit.start.repository;

import niit.start.entity.Up;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpRepository extends JpaRepository<Up, Long> {
    Up getUpById(int id);

    int deleteById(int id);
}

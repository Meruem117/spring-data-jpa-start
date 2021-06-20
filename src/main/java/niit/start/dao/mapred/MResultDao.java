package niit.start.dao.mapred;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.entity.mapred.MResult;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MResultDao extends JpaRepository<MResult, Long> {
    List<MResult> getMResultByType(int type);

    List<MResult> getMResultByTypeAndTm(int type, String tm);

    MResult getMResultByNameAndTm(String name, String tm);

    @Query(nativeQuery = true, value = "SELECT DISTINCT tm FROM mapred ORDER BY tm DESC")
    List<String> getDistinctTm();
}

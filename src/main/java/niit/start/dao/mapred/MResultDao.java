package niit.start.dao.mapred;

import org.springframework.data.jpa.repository.JpaRepository;

import niit.start.entity.mapred.MResult;

import java.util.List;

public interface MResultDao extends JpaRepository<MResult, Long> {
    List<MResult> getMResultByType(int type);

}

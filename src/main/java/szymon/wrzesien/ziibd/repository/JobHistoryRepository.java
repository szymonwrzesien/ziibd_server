package szymon.wrzesien.ziibd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import szymon.wrzesien.ziibd.model.JobHistory;

public interface JobHistoryRepository extends JpaRepository<JobHistory, String> {
}

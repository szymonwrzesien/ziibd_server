package szymon.wrzesien.ziibd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import szymon.wrzesien.ziibd.model.JobGrades;

public interface JobGradesRepository extends JpaRepository<JobGrades, String > {
}

package szymon.wrzesien.ziibd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import szymon.wrzesien.ziibd.model.SalaryAudit;

public interface SalaryAuditRepository extends JpaRepository<SalaryAudit, String> {
}

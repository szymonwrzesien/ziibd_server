package szymon.wrzesien.ziibd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import szymon.wrzesien.ziibd.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
}

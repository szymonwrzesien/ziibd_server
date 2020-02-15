package szymon.wrzesien.ziibd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import szymon.wrzesien.ziibd.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {

    @Query(value = "select MAX(employee_id) from employees", nativeQuery = true)
    Integer findLastId();
}

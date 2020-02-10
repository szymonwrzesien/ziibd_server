package szymon.wrzesien.ziibd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import szymon.wrzesien.ziibd.model.Departments;

public interface DepartmentsRepository extends JpaRepository <Departments, String>{
}

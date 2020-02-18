package szymon.wrzesien.ziibd.controller;

import org.springframework.web.bind.annotation.*;
import szymon.wrzesien.ziibd.model.Employees;
import szymon.wrzesien.ziibd.model.Jobs;
import szymon.wrzesien.ziibd.repository.EmployeesRepository;
import szymon.wrzesien.ziibd.repository.JobsRepository;

import java.util.Calendar;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AppControler {

    final EmployeesRepository employeesRepository;
    final JobsRepository jobsRepository;

    public AppControler(EmployeesRepository employeesRepository, JobsRepository jobsRepository) {
        this.employeesRepository = employeesRepository;
        this.jobsRepository = jobsRepository;
    }


    @GetMapping("/employees")
    public List<Employees> getAllEmployees() {
        return employeesRepository.findAll();
    }

    @GetMapping("/jobs")
    public List<Jobs> getAllJobs() {
        return jobsRepository.findAll();
    }

    @PostMapping("/saveNewEmployee")
    public boolean saveNewEmployee(@RequestBody Employees newEmployee) {
        Integer id = employeesRepository.findLastId() + 1;
        newEmployee.setEmployeeId(id);
        newEmployee.setHireDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        employeesRepository.save(newEmployee);
        return true;
    }

    @PostMapping("/deleteEmployee")
    public List<Employees> deleteEmployee(@RequestBody Employees newEmployee) {
        employeesRepository.delete(newEmployee);
        return employeesRepository.findAll();
    }

    @PostMapping("/updateEmployee")
    public boolean updateEmployee(@RequestBody Employees newEmployee) {
        employeesRepository.save(newEmployee);
        return true;
    }


}

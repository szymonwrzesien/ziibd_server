package szymon.wrzesien.ziibd.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import szymon.wrzesien.ziibd.model.Employees;
import szymon.wrzesien.ziibd.model.Jobs;
import szymon.wrzesien.ziibd.repository.EmployeesRepository;
import szymon.wrzesien.ziibd.repository.JobsRepository;

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
    public List<Jobs> getAllJobs() {return jobsRepository.findAll();}
}

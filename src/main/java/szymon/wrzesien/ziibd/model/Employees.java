package szymon.wrzesien.ziibd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Employees {

  @Id
  private String employeeId;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private java.sql.Date hireDate;
  private String jobId;
  private String salary;
  private String commissionPct;
  private String managerId;
  private String departmentId;


}

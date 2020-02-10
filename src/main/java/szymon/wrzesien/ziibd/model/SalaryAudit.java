package szymon.wrzesien.ziibd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class SalaryAudit {
  @Id
  private String id;
  private String employeeId;
  private java.sql.Date dop;
  private String oldSalary;
  private String newSalary;

}

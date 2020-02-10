package szymon.wrzesien.ziibd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class JobHistory {
  @Id
  private String employeeId;
  private java.sql.Date startDate;
  private java.sql.Date endDate;
  private String jobId;
  private String departmentId;

}

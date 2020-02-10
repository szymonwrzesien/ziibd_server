package szymon.wrzesien.ziibd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Jobs {
  @Id
  private String jobId;
  private String jobTitle;
  private String minSalary;
  private String maxSalary;

}

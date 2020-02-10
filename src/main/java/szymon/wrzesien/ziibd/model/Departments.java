package szymon.wrzesien.ziibd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Departments {
  @Id
  private String departmentId;
  private String departmentName;
  private String managerId;
  private String locationId;


}

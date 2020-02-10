package szymon.wrzesien.ziibd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class JobGrades {
  @Id
  private String gradeLevel;
  private String lowestSal;
  private String highestSal;

}

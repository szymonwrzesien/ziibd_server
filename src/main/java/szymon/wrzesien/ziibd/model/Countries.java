package szymon.wrzesien.ziibd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Countries {
  @Id
  private String countryId;
  private String countryName;
  private String regionId;


}

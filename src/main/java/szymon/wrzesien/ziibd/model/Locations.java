package szymon.wrzesien.ziibd.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Locations {
  @Id
  private String locationId;
  private String streetAddress;
  private String postalCode;
  private String city;
  private String stateProvince;
  private String countryId;

}

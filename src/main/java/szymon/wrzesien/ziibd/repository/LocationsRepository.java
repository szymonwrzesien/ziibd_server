package szymon.wrzesien.ziibd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import szymon.wrzesien.ziibd.model.Locations;

public interface LocationsRepository extends JpaRepository<Locations, String> {
}

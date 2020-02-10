package szymon.wrzesien.ziibd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import szymon.wrzesien.ziibd.model.Regions;

public interface RegionsRepository extends JpaRepository<Regions, String> {
}

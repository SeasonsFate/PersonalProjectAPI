package com.qa.repository;

import com.qa.models.Gear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GearRepository extends JpaRepository<Gear, Long>{
}

package com.qa.repository;

import com.qa.models.Charact;
import com.qa.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharactRepository extends JpaRepository<Charact, Long>{
}

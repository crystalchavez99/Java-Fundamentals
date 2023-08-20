package com.company.coffeeinventory.repository;

import com.company.coffeeinventory.model.Coffee;
import com.company.coffeeinventory.model.Roaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoasterRepository extends JpaRepository<Roaster, Integer> {
}

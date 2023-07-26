package com.company.coffeeinventory.repository;

import com.company.coffeeinventory.model.Coffee;

import java.util.List;

public interface CoffeeRepository {
    List<Coffee> findByRoasterId(Integer roasterId);

    List<Coffee> findByType(String type);

    List<Coffee> findByRoasterIdAndType(Integer roasterId, String type);


}

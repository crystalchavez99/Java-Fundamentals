package com.company.coffeeinventory.repository;

import com.company.coffeeinventory.model.Coffee;
import com.company.coffeeinventory.model.Roaster;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CoffeeRepositoryTest {
    @Autowired
    CoffeeRepository coffeeRepository;

    @Autowired
    RoasterRepository roasterRepository;

    @BeforeEach
    void setUp() {
        coffeeRepository.deleteAll();
        roasterRepository.deleteAll();
    }

    @Test
    @Transactional
    public void shouldAddAndFindByID(){
        Roaster roaster = new Roaster();

        roaster.setName("Perd");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setEmail("perd@perdroasters.com");
        roaster.setNote("Really Good!");

        roasterRepository.save(roaster);

        Coffee coffee = new Coffee();

        coffee.setRoasterId(roaster.getId());
        coffee.setName("Juggernaut");
        coffee.setCount(5);
        coffee.setUnitPrice(new BigDecimal("11.50"));

        coffeeRepository.save(coffee);

        Coffee fromRepo = coffeeRepository.findById(coffee.getId()).get();
        assertEquals(coffee,fromRepo);
    }

    @Test
    @Transactional
    void findByRoasterId() {
        Roaster roaster = new Roaster();
        roaster.setName("Perd");
        roaster.setStreet("Broad St");
        roaster.setCity("Savannah");
        roaster.setState("GA");
        roaster.setEmail("perd@perdroasters.com");
        roaster.setNote("Really Good!");

        roasterRepository.save(roaster);

        Roaster roaster2 = new Roaster();
        roaster2.setName("John's");
        roaster2.setStreet("Price St");
        roaster2.setCity("Savannah");
        roaster2.setState("GA");
        roaster2.setEmail("john@johnroasters.com");
        roaster2.setNote("Really mid!");

        roasterRepository.save(roaster2);

        Coffee coffee = new Coffee();
        coffee.setRoasterId(roaster.getId());
        coffee.setName("Juggernaut");
        coffee.setCount(5);
        coffee.setUnitPrice(new BigDecimal("11.50"));

        coffeeRepository.save(coffee);

        Coffee coffee2 = new Coffee();
        coffee2.setRoasterId(roaster2.getId());
        coffee2.setName("Gemini");
        coffee2.setCount(5);
        coffee2.setUnitPrice(new BigDecimal("11.50"));

        coffeeRepository.save(coffee2);

        List<Coffee> perdCoffee = coffeeRepository.findByRoasterId(roaster.getId());
        List<Coffee> johnCoffee = coffeeRepository.findByRoasterId(roaster2.getId());

        assertEquals(1, perdCoffee);
        assertEquals(1, johnCoffee);

    }

    @Test
    void findByType() {
    }

    @Test
    void findByRoasterIdAndType() {
    }
}
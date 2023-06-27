package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreederTest {

    private Breeder breeder;
    private Dog dog1;
    private Dog dog2;

    @BeforeEach
    void setUp() {
        breeder = new Breeder();

        dog1 = new Dog();
        dog1.setAge(3);
        dog1.setColor("Brown");
        dog1.setFavToy("Squeaky");

        dog2 = new Dog();
        dog2.setAge(3);
        dog2.setColor("Grey");
        dog2.setFavToy("Rope");
    }

    @Test
    void breedDogs() {
        Dog newDog1 = new Dog();
        newDog1.setAge(0);
        newDog1.setColor("BrownGrey");
        newDog1.setFavToy("Squeaky");

        Dog newDog2 = new Dog();
        newDog2.setAge(0);
        newDog2.setColor("GreyBrown");
        newDog2.setFavToy("Rope");

        assertEquals(newDog1, breeder.breedDogs(dog1,dog2));
        assertEquals(newDog2, breeder.breedDogs(dog2,dog1));
    }
}
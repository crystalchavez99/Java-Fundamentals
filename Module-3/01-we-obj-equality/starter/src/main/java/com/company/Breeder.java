package com.company;

public class Breeder {
    public Dog breedDogs(Dog f, Dog m){
        Dog puppy = new Dog();
        puppy.setAge(0);
        puppy.setColor(f.getColor() + m.getColor());
        puppy.setFavToy(f.getFavToy());
        return puppy;
    }
}

package com.example.citywebservice.models;

import javax.validation.constraints.NotEmpty;

public class City {
    @NotEmpty(message = "You must put a name for a city.")
    private String name;

    public City() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotEmpty(message = "You must supply a state.")
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @NotEmpty(message = "You must supply the population.")
    private int population;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    private boolean capital;

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public City(String name, String state, int population, boolean capital) {
        this.name = name;
        this.state = state;
        this.population = population;
        this.capital = capital;
    }
}

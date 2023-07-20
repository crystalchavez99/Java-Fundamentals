package com.example.citywebservice.controllers;

import com.example.citywebservice.models.City;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CityController {
    private List<City> cityList;

    public CityController(){
        cityList = new ArrayList<>();
        cityList.add(new City("Santa Clarita", "California", 50000, false));
        cityList.add(new City("Washington D.C", "Washington D.C", 700000, true));
        cityList.add(new City("Austin", "Texas", 500500, true));

    }

    // Get /city all cities
    @RequestMapping(value ="/city", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<City> getAllCities(){
        return cityList;
    }

    // Get /city/{name}
    @RequestMapping(value="/city/{name}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public City getCityByName(@PathVariable String name){
        City foundCity = null;
        for(City city: cityList){
            if(city.getName() == name){
                foundCity = city;
                break;
            }
        }
        return foundCity;
    }

    // Post /city
    @RequestMapping(value = "/city", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public City createCity(@RequestBody @Valid City city){
        cityList.add(city);
        return city;
    }

    // DELETE /city/{name}
    @RequestMapping(value = "/city/{name}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteCityByName(@PathVariable String name){
        int index = -1;
        for(int i = 0; i < cityList.size(); i++){
            if(cityList.get(i).getName() == name){
                index = i;
                break;
            }
        }
        if(index >=0){
            cityList.remove(index);
        }
    }
}

package com.example.citywebservice.controller;


import com.example.citywebservice.controllers.CityController;
import com.example.citywebservice.models.City;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CityController.class)
public class CityControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private List<City> cityList;

    @BeforeEach
    public void setUp(){
        // Set Up Method

    }

    // Testing Get /city
    @Test
    public void shouldReturnAllCitiesInCollection() throws Exception{
        String outputJson = mapper.writeValueAsString(cityList);

        mockMvc.perform(get("/city"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    // Testing GET /city/{name}
    @Test
    public void shouldReturnCityByName() throws Exception{
        City outputCity = new City();
        outputCity.setName("Fullerton");
        outputCity.setState("California");
        outputCity.setPopulation(55000);
        outputCity.setCapital(false);

        String outputJson = mapper.writeValueAsString(outputCity);

        mockMvc.perform(get("/city/Fullerton"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    // Testing POST /city
    @Test
    public void shouldReturnNewCityOnValidPostRequest() throws Exception{
        City inputCity = new City();
        inputCity.setName("Valencia");
        inputCity.setState("California");
        inputCity.setPopulation(15000);
        inputCity.setCapital(false);

        String inputJson = mapper.writeValueAsString(inputCity);
        //String outputJson = mapper.writeValueAsString(inputCity);

        mockMvc.perform(
                        post("/city")                            // Perform the POST request
                                .content(inputJson)                       // Set the request body
                                .contentType(MediaType.APPLICATION_JSON)  // Tell the server it's in JSON format
                )
                .andDo(print())                                // Print results to console
                .andExpect(status().isCreated());


    }

    @Test
    public void shouldDeleteCityByName() throws Exception{
        mockMvc.perform(delete("/city/Fullerton"))
                .andDo(print())
                .andExpect(status().isNoContent());
    }
}

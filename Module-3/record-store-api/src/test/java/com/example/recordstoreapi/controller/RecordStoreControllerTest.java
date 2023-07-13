package com.example.recordstoreapi.controller;
import com.example.recordstoreapi.models.Record;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(RecordStoreController.class)
public class RecordStoreControllerTest {// Wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

// A list of records for testing purposes
    private List<Record> recordList;

    @BeforeEach
    public void setUp() {
        // Standard set up method for instantiating test objects
        // Don't have to do anything special for mockMvc since it's Autowired
    }}

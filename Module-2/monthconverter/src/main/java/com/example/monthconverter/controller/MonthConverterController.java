package com.example.monthconverter.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class MonthConverterController {
    String[] months = {"January", "February", "March", "April","May","June","July","August","Spetember","October","November","December"};

    @RequestMapping(value="/months/{monthNumber}", method =RequestMethod.GET)
    public String getMonth(@PathVariable int monthNumber){
        if(monthNumber >=1 && monthNumber <=12){
            return months[monthNumber - 1];
        }else{
            return "Invalid number!";
        }
    }

}

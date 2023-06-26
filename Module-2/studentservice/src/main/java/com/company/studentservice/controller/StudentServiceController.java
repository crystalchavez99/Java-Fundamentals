package com.company.studentservice.controller;
import com.company.studentservice.models.Student;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class StudentServiceController {
    List <Student> studentList = new ArrayList<>();

    //This data would come from your db in real life
    public StudentServiceController(){
        studentList.add(new Student("Sam"));
        studentList.add(new Student("Lisa"));
        studentList.add(new Student("Ming"));
        studentList.add(new Student("Lynda"));
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getStudents() {
        return studentList;
    }

    @RequestMapping(value = "/students/{index}", method = RequestMethod.GET)
    public Student getStudentByIndex(@PathVariable int index) {
        return studentList.get(index);
    }
}

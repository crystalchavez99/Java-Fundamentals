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
    // List of students to mock a db
    List<Student> studentList = new ArrayList<>();
    // This data would come from your db in real life
    // populate the studentlist with Students via the StudentSercieController Constructor
    public StudentServiceController(){
        studentList.add(new Student("Sam"));
        studentList.add(new Student("Lisa"));
        studentList.add(new Student("Ming"));
        studentList.add(new Student("Lynda"));
    }
    // route to get all students
    // http method: get
    // uri: /students
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> getStudents(){
        return studentList;
    }
    // route to get a student by index
    // http method: get
    // uri: /students/{index}
    @RequestMapping(value = "/students/{index}", method = RequestMethod.GET)
    public Student getStudentByIndex(@PathVariable int index){
        return studentList.get(index);
    }
    // route to get a student by name
    // http method: get
    // uri: /studentsByName/{name}
    @RequestMapping(value="/studentsByName/{name}", method = RequestMethod.GET)
    public Student getStudentByName(@PathVariable String name){
        Student selectedStudent = null;
        for (Student student: studentList){
            if(student.getName().equals(name)){
                selectedStudent = student;
            }
        }
        return selectedStudent;
    }







}

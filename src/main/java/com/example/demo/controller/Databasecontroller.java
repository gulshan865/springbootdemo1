package com.example.demo.controller;

import com.example.demo.models.Student;
import com.example.demo.service.DbService;
import org.apache.catalina.valves.StuckThreadDetectionValve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

public class Databasecontroller {
@Autowired
    DbService service;

    @PostMapping("/addd_std")

    public String addStudent(@RequestBody Student student){

        return service.addstudent(student);
    }
@GetMapping("/get_std")
    public List<Student> getstudent(){
        return service.getstudent();

}
}

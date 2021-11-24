package com.example.demo.controller;

import com.example.demo.models.Employee;
import com.example.demo.service.EmployeDB_S;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeDB {

    @Autowired
        EmployeDB_S service;

        @PostMapping("/add_emp")
        public String employe(@RequestBody Employee emoployee) {

           return service.addemploye(emoployee);




        }
    }


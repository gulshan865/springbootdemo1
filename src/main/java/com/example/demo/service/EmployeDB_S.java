package com.example.demo.service;

import com.example.demo.models.Employee;


import com.example.demo.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeDB_S {

    @Autowired
    EmployeeJpaRepository repositry;

    public String addemploye(Employee employee){
        repositry.save(employee);

        return "employee details: "+ employee.getName();

    }
}






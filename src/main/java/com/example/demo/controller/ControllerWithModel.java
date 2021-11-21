package com.example.demo.controller;

import com.example.demo.models.Employee;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class ControllerWithModel {
    List<Employee> detaillist = new ArrayList<>();

    @RequestMapping("/add1")
    public String add(){
        Employee emploee = new Employee("subodh kumar",26,55500.0,"samsung");
        detaillist.add(emploee);
        return "employee added successfully";
    }

    @RequestMapping("getmodel")
    public List<Employee> getDetaillist(){
        return detaillist;
    }

    @RequestMapping("/changer")
    public String changer(){
        detaillist.get(0).setName("Gulshan");
        detaillist.get(0).setAge(27);
        detaillist.get(0).setSalary(75000.27);
        detaillist.get(0).setCompany("TCL");

        return "object updated successfully";
    }

    @RequestMapping("/terminate")
    public String remove(){
        detaillist.remove(0);

        return "object removed successfully";
    }
}



package com.example.demo.controller;

import com.example.demo.models.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {
    List<Employee> employeelist = new ArrayList<>();

    @RequestMapping("/addd")
    public String add(){
        Employee emp  = new Employee("subodh",26,23599.0,"Rini financial ");
        Employee emp1 = new Employee("gulshan kumar",27,43999.0,"TCL");
        Employee emp2 = new Employee("shubendra kumar",24,53999.0,"Java");

        employeelist.add(emp);
        employeelist.add(emp1);
        employeelist.add(emp2);

        return "object added";
    }

    @RequestMapping("/gett")
    public List<Employee> getEmployeelist(){
        return employeelist;
    }

    @RequestMapping("/updatt")
    public String update(@RequestParam String name, @RequestParam int age, @RequestParam double salary, @RequestParam String company){
        employeelist.get(0).setName(name);
        employeelist.get(0).setAge(age);
        employeelist.get(0).setSalary(salary);
        employeelist.get(0).setCompany(company);

        return "updated successfully";

    }

    @RequestMapping("/dlt")
    public String remove(@RequestParam String name){
        employeelist.remove(0);

        return "removed successfully";
    }

}



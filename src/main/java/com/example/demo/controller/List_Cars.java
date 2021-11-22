package com.example.demo.controller;

import com.example.demo.models.Cars;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class List_Cars {

    List<Cars> car_details = new ArrayList<>();
    @RequestMapping(value = "/add car",method = RequestMethod.POST)
    public String add_car(@RequestBody Cars car1){
        car_details.add(car1);
        return "car details added";
    }
@RequestMapping(value = "/get car",method = RequestMethod.GET)
    public List<Cars> getCar_details() {
        return car_details;
    }
    @RequestMapping(value = "/update car",method = RequestMethod.PUT)
    public String update(@RequestParam String name1,@RequestParam String name2,@RequestParam int name3){
        car_details.get(0).setCompany(name1);
        car_details.get(1).setModel(name2);
        car_details.get(2).setPrice(name3);
        return "car details updeted";

    }
    @RequestMapping(value = "/remove car",method = RequestMethod.DELETE)
    public String delete(@RequestParam String name){
        car_details.remove(2);
        return "car removed";
    }

}

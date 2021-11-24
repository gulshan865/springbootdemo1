package com.example.demo.controller;

import com.example.demo.service.ServiceMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
    @Autowired
    ServiceMovie service;
    @RequestMapping("/moviename")
    public String movie(){
      //  String movie="Radhey";
        String movie= service.movie();
        return movie;
    }


}

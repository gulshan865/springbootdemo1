package com.example.demo.controller;

import com.example.demo.service.Ball;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bat {
@Autowired
    Ball ball;
    @RequestMapping("/batsman")

    public String batsman(){

  //      String name = "ms dhoni";
        String name=ball.bowler();
        return  name;
    }
}

package com.example.demo.controller;

import com.example.demo.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApplicationflowController {
    @Autowired
    ApplicationService service;
@RequestMapping("/first")
    public String flow1(){
    String message = service.repositry();
        return message;

    }
}

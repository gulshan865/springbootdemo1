package com.example.demo.service;

import com.example.demo.repository.Filder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ball {
@Autowired
    Filder filder;
    public String bowler(){

       // return "yuzvendra chahal";
        String newfilder = filder.ground();
        return newfilder;
    }
}

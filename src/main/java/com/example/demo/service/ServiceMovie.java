package com.example.demo.service;

import com.example.demo.repository.RepositoryMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMovie {
@Autowired
RepositoryMovie repositry;
    public String movie(){
      //  return "wanted";
        String film = repositry.movie();
        return film;
    }
}

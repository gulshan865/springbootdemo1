package com.example.demo.service;

import com.example.demo.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ApplicationService {

    @Autowired

    ApplicationRepository repository;


     public String repositry(){


        return repository.repositry();
    }
}

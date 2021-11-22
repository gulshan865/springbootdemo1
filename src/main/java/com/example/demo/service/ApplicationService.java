package com.example.demo.service;

import com.example.demo.repositry.ApplicationRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Service
public class ApplicationService {

    @Autowired
    ApplicationRepositry repository;
     public String repositry(){


//        return "from serivice class";
        ApplicationRepositry repo = new ApplicationRepositry();
        return repo.repositry();
    }
}

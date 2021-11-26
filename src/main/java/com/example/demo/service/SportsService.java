package com.example.demo.service;

import com.example.demo.models.Sports;
import com.example.demo.models.Student;
import com.example.demo.repository.SportsJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Id;
import java.util.List;

@Service
public class SportsService {

    @Autowired
    SportsJpaRepository repository;

    public String addsports(Sports sports){
        repository.save(sports);

        return "successfully sports details added";
    }

    public List<Sports> getlist(){

        return repository.findAll();
    }
    public String update(Sports sports){
        repository.save(sports);

        return "updated successfully";

    }

    public String remove(Long id){
        repository.deleteById(id);
        return "Deleted successfully";
    }



}

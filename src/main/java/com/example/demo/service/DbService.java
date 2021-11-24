package com.example.demo.service;

import com.example.demo.models.Student;
import com.example.demo.repository.StudentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    StudentJpaRepository repositry;

    public String addstudent(Student student){
        repositry.save(student);

        return  "Successfully saved to database";
    }
public List<Student> getstudent(){
        return repositry.findAll();
}

}

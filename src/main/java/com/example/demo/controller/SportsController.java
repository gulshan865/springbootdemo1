package com.example.demo.controller;

import com.example.demo.models.Sports;
import com.example.demo.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportsController {

    @Autowired
    SportsService service;

    @PostMapping("/add_sport")
    public String addspots(@RequestBody Sports sports){
        return service.addsports(sports);
    }

    @GetMapping("/get_sports")
    public List<Sports> getService() {
        return service.getlist();
    }
    @PutMapping("/update_sports")
    public  String update(@RequestBody Sports sports){
        return service.update(sports);
    }

    @DeleteMapping("/remove_sports")
    public String remove(@RequestParam Long id){
        return service.remove(id);
    }
}

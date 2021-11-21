package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class ListControllerWithParams {

    List<String> namelist = new ArrayList<>();

    @RequestMapping("/add")
    public  String add() {
        namelist.add("hello world");
        namelist.add("hello future");
        namelist.add("hello past ");
        return "params added successfully";
    }

    @RequestMapping("/getter")
    public List<String> getNamelist(){
        return namelist;
    }

    @RequestMapping("/uptodate")
    public String update(){
        namelist.remove(2);
        namelist.add(2,"Hello welcome to the past");
        return "object updated successfully";
    }

    @RequestMapping("/rem")
    public String remove(){
        namelist.remove(2);
        return "object remove successfully";
    }

}



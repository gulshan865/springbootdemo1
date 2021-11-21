package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListController {
List<String> stringList = new ArrayList<>();

    @RequestMapping("/message")
    public String addlist(){
        stringList.add("Shubendra");
        stringList.add("gulshan");
        stringList.add("subodh");
        stringList.add("arun");
        return "my name is successfully added to this method";
    }

    @RequestMapping("/get")
    public List<String> getStringList() {
        return stringList;
    }

    @RequestMapping("/update")
    public String updatelist(){
        stringList.remove(0);
        stringList.add(0,"parmendra");
        return "my name is updated successfully  to this update method";
    }

    @RequestMapping("/remove")
    public String deletelist(){
        stringList.remove(2);
        return "object is removed successfully throgh remove method";
    }
}



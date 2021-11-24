package com.example.demo.controller;

import com.example.demo.models.Product;
import com.example.demo.service.ProductDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductDBService service;

    @PostMapping("/add_product")
    public String addproduct(@RequestBody Product product){

       return service.addproduct(product);
    }

    @GetMapping("/get_product")
    public List<Product> getproduct(){

        return service.getproduct();

    }

    @PutMapping("/update_product")

    public String updateproduct(@RequestBody Product product){
        return  service.updateproduct(product);
    }

    @DeleteMapping("/remove_product")

    public String deletproduct(Long id){
        return service.deletproduct(id);
    }
}

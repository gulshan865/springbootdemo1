package com.example.demo.service;

import com.example.demo.models.Product;
import com.example.demo.repository.ProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDBService {

    @Autowired
    ProductJpaRepository reposirtory;
    public String addproduct(Product product){
        reposirtory.save(product);

        return " Product Added Successfully";

    }

    public List<Product> getproduct(){

        return reposirtory.findAll();
    }

    public String updateproduct(Product product){
        reposirtory.save(product);
        return " Product updated Successfully";
    }

    public  String deletproduct(Long id){

        reposirtory.deleteById(id);

        return "successfully deleted";

    }
}

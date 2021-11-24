package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
        @GeneratedValue
        Long Id;
    String productname;
    String manufaturer;
    double price;
    int expiry;

    public Product() {

    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public void setManufaturer(String manufaturer) {
        this.manufaturer = manufaturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExpiry() {
        return expiry;
    }

    public void setExpiry(int expiry) {
        this.expiry = expiry;
    }

    public Product(String productname, String manufaturer, double price, int expiry) {
        this.productname = productname;
        this.manufaturer = manufaturer;
        this.price = price;
        this.expiry = expiry;
    }
}

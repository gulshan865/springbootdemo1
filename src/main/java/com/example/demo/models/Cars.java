package com.example.demo.models;

public class Cars {
    String company;
    String model;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Cars(String company, String model, int price) {
        this.company = company;
        this.model = model;
        this.price = price;
    }

    int price;
}

package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sports {
    @Id
            @GeneratedValue
            Long Id;
    String sportname;
    String equipments;
    int numberofplayers;

    public Sports() {

    }

    public String getSportname() {
        return sportname;
    }

    public void setSportname(String sportname) {
        this.sportname = sportname;
    }

    public String getEquipments() {
        return equipments;
    }

    public void setEquipments(String equipments) {
        this.equipments = equipments;
    }

    public int getNumberofplayers() {
        return numberofplayers;
    }

    public void setNumberofplayers(int numberofplayers) {
        this.numberofplayers = numberofplayers;
    }

    public Sports(String sportname, String equipments, int numberofplayers) {
        this.sportname = sportname;
        this.equipments = equipments;
        this.numberofplayers = numberofplayers;
    }
}

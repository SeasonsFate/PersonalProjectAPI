package com.qa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    Long type; // Ring = 1, Earring = 2, Necklace = 3
    String name;
// look at relations in springboot
    Long ap;
    Long dp;

    public Item(){
        super();
    }

    public Item(Long type, String name, Long ap, Long dp){
        this.type = type;
        this.name = name;
        this.ap = ap;
        this.dp = dp;
    }

    public long getAp() {
        return ap;
    }

    public void setAp(long ap) {
        this.ap = ap;
    }

    public long getDp() {
        return dp;
    }

    public void setDp(long dp) {
        this.dp = dp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
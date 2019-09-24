package com.qa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Charact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    Long ring;
    Long necklace;
    Long earring;
    String buildname;

    public Charact(){
        super();
    }

    public Charact(Long ring,Long necklace,Long earring, String buildname){
        this.ring = ring;
        this.necklace = necklace;
        this.earring = earring;
        this.buildname = buildname;
    }

    public String getBuildname() {
        return buildname;
    }

    public void setBuildname(String buildname) {
        this.buildname = buildname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRing() {
        return ring;
    }

    public void setRing(Long ring) {
        this.ring = ring;
    }

    public Long getNecklace() {
        return necklace;
    }

    public void setNecklace(Long necklace) {
        this.necklace = necklace;
    }

    public Long getEarring() {
        return earring;
    }

    public void setEarring(Long earring) {
        this.earring = earring;
    }
}
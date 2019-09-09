package com.qa.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Build {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    String buildsName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuildsName() {
        return buildsName;
    }

    public void setBuildsName(String buildsName) {
        this.buildsName = buildsName;
    }
}

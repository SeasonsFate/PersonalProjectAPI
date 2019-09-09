package com.qa.controllers;

import com.qa.models.Build_gear;
import com.qa.repository.Build_gearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin()
public class Build_gearController {

    @Autowired
    private Build_gearRepository buildgearrepository;

    @RequestMapping(value = "saved_builds", method = RequestMethod.GET)
    public List<Build_gear> listAllBuildGears(){
        return buildgearrepository.findAll();
    }

}

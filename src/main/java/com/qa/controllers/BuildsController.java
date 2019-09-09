package com.qa.controllers;

import com.qa.models.Build;
import com.qa.repository.BuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()

public class BuildsController {

    @Autowired
    private BuildRepository buildrepository;

    @RequestMapping(value = "savedbuilds", method = RequestMethod.GET)
    public List<Build> listAllBuilds(){
        return buildrepository.findAll();
    }

    @RequestMapping(value ="savedbuilds", method = RequestMethod.POST)
    public  Build addBuild(@RequestBody Build build){
        return buildrepository.saveAndFlush(build);
    }

    @RequestMapping(value = "savedbuilds/{id}",method = RequestMethod.DELETE)
    public String deleteBuild(@PathVariable Long id){
        Build existing = buildrepository.findOne(id);
        buildrepository.delete(existing);
        return "Build " + id + "deleted";
    }



}

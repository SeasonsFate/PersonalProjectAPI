package com.qa.controllers;

import com.qa.models.Gear;
import com.qa.repository.GearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()

public class GearController {

    @Autowired
    private GearRepository gearRepository;

//    @RequestMapping(value = "build", method = RequestMethod.GET)
//    public List<Gear> listGear(){
//        List<Gear> gear =  gearRepository.findAll();
//        List<Gear> filteredGear =  gearRepository.findAll();
//        gear.forEach( {
//                record -> record.getHiddenEvasion() == "£";
//                filteredGear.add(record)
//        } );
//
//
//        return gear;
//    }

    @RequestMapping(value = "build", method = RequestMethod.GET)
    public List<Gear> listAllGear(){
        return gearRepository.findAll();
    }

    @RequestMapping(value = "build", method = RequestMethod.POST)
    public Gear addGear(@RequestBody Gear gear) {
        return gearRepository.saveAndFlush(gear);
    }


}

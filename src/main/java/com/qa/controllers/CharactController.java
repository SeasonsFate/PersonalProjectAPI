package com.qa.controllers;

import com.qa.models.Charact;
import com.qa.repository.CharactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
public class CharactController {

    @Autowired
    private CharactRepository charactRepository;


    @RequestMapping(value = "character", method = RequestMethod.GET)
    public List<Charact> listAllCharacters() {
        return charactRepository.findAll();
    }

    @RequestMapping(value = "character", method = RequestMethod.POST)
    public Charact addCharacter(@RequestBody Charact charact) {
        return charactRepository.saveAndFlush(charact);
    }

    @RequestMapping(value = "character/{id}", method = RequestMethod.DELETE)
    public Charact deleteCharacter(@PathVariable Long id) {
        Charact existing = charactRepository.findOne(id);
        charactRepository.delete(id);
        return existing;
    }

    @PutMapping(value = "character/{id}")
    public Charact updateCharacter(@RequestBody Charact newCharacter, @PathVariable Long id){
        Charact oldCharacter = charactRepository.findOne(id);
        oldCharacter.setBuildname(newCharacter.getBuildname());
        oldCharacter.setEarring(newCharacter.getEarring());
        oldCharacter.setNecklace(newCharacter.getNecklace());
        oldCharacter.setRing(newCharacter.getRing());
        return charactRepository.saveAndFlush(oldCharacter);
    }

}

package com.qa.controllers;

import com.qa.models.Item;
import com.qa.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

//    @RequestMapping(value = "build", method = RequestMethod.GET)
//    public List<Item> listGear(){
//        List<Item> gear =  gearRepository.findAll();
//        List<Item> filteredGear =  gearRepository.findAll();
//        gear.forEach( {
//                record -> record.getHiddenEvasion() == "£";
//                filteredGear.add(record)
//        } );
//
//
//        return gear;
//    }

//    @CrossOrigin("http://localhost:200")
    @RequestMapping(value = "item", method = RequestMethod.GET)
    public List<Item> listAllItems() {
        return itemRepository.findAll();
    }

    @RequestMapping(value = "item", method = RequestMethod.POST)
    public Item addItem(@RequestBody Item item) {
        return itemRepository.saveAndFlush(item);
    }

    @RequestMapping(value = "build/{id}", method = RequestMethod.DELETE)
    public Item deleteItem(@PathVariable Long id) {
        Item existing = itemRepository.findOne(id);
        itemRepository.delete(existing);
        return existing;

    }


}

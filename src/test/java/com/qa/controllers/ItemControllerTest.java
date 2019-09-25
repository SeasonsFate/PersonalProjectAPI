package com.qa.controllers;

import com.qa.models.Item;
import com.qa.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemControllerTest {

    @InjectMocks
    private ItemController itemController;

    @Mock
    private ItemRepository itemRepository;

    @Test
    public void testListAllItems() {
        List<Item> itemsList = new ArrayList<>();
        Item item = new Item();
        item.setType(1L);
        item.setAp(5L);
        item.setDp(0L);
        item.setName("Crescent");
        itemsList.add(item);
        when(itemRepository.findAll()).thenReturn(itemsList);
        assertEquals(
                itemController.listAllItems().get(0).getName(), "Crescent"
        );
    }

    @Test
    public void testAddItem() {
        Item item = new Item();
        item.setName("Crescent");
        item.setType(1L);
        item.setAp(5L);
        item.setDp(0L);
        when(itemRepository.saveAndFlush(item)).thenReturn(item);
        //assertEquals("yes",charactController.addCharacter(character).getBuildname());
        assertEquals("Crescent",itemController.addItem(item).getName());
    }

    @Test
    public void testDeleteItem() {
//        Charact character = new Charact(1L,2L,3L, "yes");
//        when(charactRepository.findOne(1L)).thenReturn(character);
//        assertEquals("yes", charactController.deleteCharacter(1L).getBuildname());
        Item item = new Item(1L,"Crescent",5L,0L);
        when(itemRepository.findOne(1L)).thenReturn(item);
        assertEquals("Crescent",itemController.deleteItem(1L).getName());
    }
}

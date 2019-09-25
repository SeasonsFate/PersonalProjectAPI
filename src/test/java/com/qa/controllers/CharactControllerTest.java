package com.qa.controllers;

import com.qa.models.Charact;
import com.qa.repository.CharactRepository;
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
public class CharactControllerTest {

    @InjectMocks
    private CharactController charactController;

    @Mock
    private CharactRepository charactRepository;

    @Test
    public void testListAllCharacters() {
        List<Charact> buildsList = new ArrayList<>();
        Charact build = new Charact();
        build.setBuildname("yes");
        build.setRing(1L);
        build.setNecklace(2L);
        build.setEarring(3L);
        buildsList.add(build);
        when(charactRepository.findAll()).thenReturn(buildsList);
        assertEquals(
                charactController.listAllCharacters().get(0).getBuildname(),
                "yes"
        );
    }

    @Test
    public void testAddCharacter(){
        Charact character = new Charact();
        character.setBuildname("yes");
        character.setRing(1L);
        character.setEarring(2L);
        character.setNecklace(3L);
        when(charactRepository.saveAndFlush(character)).thenReturn(character);
        assertEquals("yes",charactController.addCharacter(character).getBuildname());
    }

    @Test
    public void testDeleteCharacter() {
        Charact character = new Charact(1L,2L,3L, "yes");
        when(charactRepository.findOne(1L)).thenReturn(character);
        assertEquals("yes", charactController.deleteCharacter(1L).getBuildname());
    }

    @Test
    public void testUpdateCharacter(){
        Charact character1 = new Charact();
        Charact character2 = new Charact();
        character1.setRing(1L);
        character1.setEarring(2L);
        character1.setNecklace(3L);
        Long id = 1L;
        when(charactRepository.findOne(1L)).thenReturn(character2);
        when(charactRepository.saveAndFlush(character2)).thenReturn(character2);
        assertEquals((Long)1L,charactController.updateCharacter(character1,id).getRing());
    }
}
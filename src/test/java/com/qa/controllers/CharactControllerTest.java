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
    public void testGetAllBuilds() {
        List<Charact> buildsList = new ArrayList<>();
        Charact build = new Charact();
        build.setBuildname("yes");
        build.setRing(1L);
        build.setNecklace(2L);
        build.setEarring(3L);
        when(charactRepository.findAll()).thenReturn(buildsList);
        assertEquals(
                charactController.listAllCharacters().get(0).getBuildname(),
                "yes"
        );
    }
}
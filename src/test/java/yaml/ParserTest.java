package yaml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.junit.Before;
import org.junit.Test;

import model.Game;
import model.Player;
import model.System;

public class ParserTest {
    private YamlManager parser;

    @Before
    public void setup() {
        parser = new YamlManager();
    }

    @Test
    public void testParser() throws IOException {
        assertNotNull(parser);
        File file = new File("src\\test\\java\\yaml\\testParser.yaml");
        assertTrue(file.exists());
        Game game = parser.readGame(file);
        assertNotNull(game);
        assertEquals("test1", game.getName());
        List<System> systems = game.getSystems();
        assertEquals(2,systems.size());
        assertEquals("s1", systems.get(0).getId());
    }

    @Test
    public void testWriter() throws JsonProcessingException {
        Player hacan = new Player("hacan");
        Player necro = new Player("necro virus");
        System s1 = new System();
        s1.setId(1);
        s1.setNeighbors(List.of(2, 3));
        System s2 = new System();
        s2.setId(2);
        s2.setNeighbors(List.of(1, 3));
        System s3 = new System();
        s3.setId(3);
        s3.setNeighbors(List.of(2, 3));
        Game game = new Game("Testgame");
        game.setSystems(List.of(s1, s2, s3));
        game.setPlayers(List.of(hacan, necro));
        parser.writeGame(game);
    }
}

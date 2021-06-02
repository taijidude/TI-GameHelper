package json;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;

import model.Game;
import model.Player;

public class jsonManagerTest {
    
    private ObjectMapper objm =new ObjectMapper();

    @Test
    public void test1() throws JsonProcessingException{
        Game game = new Game("TestSpiel");
        game.setPlayers(Arrays.asList(new Player("Lutz"), new Player("Axel")));
        System.out.println(objm.writeValueAsString(game));
    }
}

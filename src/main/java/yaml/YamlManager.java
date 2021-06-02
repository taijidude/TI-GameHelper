package yaml;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import model.Game;

public class YamlManager {
    private ObjectMapper mapper;

    YamlManager() {
        mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
    }

    public Game readGame(File description) throws JsonParseException, JsonMappingException, IOException {
        return mapper.readValue(description, Game.class);
    }

    public Game readGame(String description) throws JsonMappingException, JsonProcessingException {
        return mapper.readValue(description, Game.class);
    }

    public void writeGame(Game game) throws JsonProcessingException {
        String output = mapper.writeValueAsString(game);       
        System.out.println(output);
    }
}

package model;

import java.util.List;

public class Game {
  String name;
  List<Player> players;
  List<System> systems;

  public Game(String name) {
    this.name = name;

  }

  public String getName() {
	  return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }
  
  public List<Player> getPlayers() {
    return players;
  }

  public void setSystems(List<System> systems) {
    this.systems = systems;
  }

  public List<System> getSystems() {
    return systems;
  }

}
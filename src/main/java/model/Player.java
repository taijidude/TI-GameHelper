package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Player {

  private String name;
  private int strategyPool; 
  private int tacticPool;
  private int tradeGoods;
  private List<Planet> planets = new ArrayList<>();
  private List<Technology> technologies = new ArrayList<>();
  Map<Location, Force> placedForces = new HashMap<>();
  
  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //Trade Goods
  //Number of Action Cards
  public List<Planet> getPlanets() {
    return planets;
  }

  public List<Technology> getTechnologies() {
    return technologies;
  }

  public int getRessources() {
    int result = 0;
    for (Planet planet : planets) {
      if(!planet.isExhausted()) {
        result += planet.getRessources();
      }
    }
    return result;
  }

  public int getInfluence() {
    int result = 0;
    for (Planet planet : planets) {
      if(!planet.isExhausted()) {
        result += planet.getInfluence();
      }
    }
    return result;
  }

  public int getTacticPool() {
    return tacticPool;
  }

  public int getStrategyPool() {
    return strategyPool;
  }

  public int getTradeGoods() {
    return tradeGoods;
  }

  public void setTacticPool(int tacticPool) {
    this.tacticPool = tacticPool;
  }

  public void setStrategyPool(int strategyPool) {
    this.strategyPool = strategyPool;
  }

  public void setTradeGoods(int tradeGoods) {
    this.tradeGoods = tradeGoods;
  }

  public void addPlanets(Planet... planets) {
    this.planets.addAll(Arrays.asList(planets));
  }

  public void addTechnologies(Technology... technologies) {
    this.technologies.addAll(Arrays.asList(technologies));
  }

  public List<Planet> getHomeSystemPlanets() {
    return planets.stream().filter(planet -> planet.getSystem().isHomeSystem()).collect(Collectors.toList());
  }

  public List<Planet> getNonHomeSystemPlanets() {
    return planets.stream().filter(planet -> !planet.getSystem().isHomeSystem()).collect(Collectors.toList());
  }

  public List<Technology> getUnitUpgradeTechnologies() {
    List<Technology> result = new ArrayList<>();
    for (Technology technology : technologies) {
      if (technology.isUnitUpgrade()) {
        result.add(technology);
      }
    }
    return result;
  }

}
package model;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import model.Game;

public enum Objectives {
  //  Corner the Market   Control 4 planets that each have the same planet trait  1
  CORNER_THE_MARKET((game, player) -> {
    List<Planet> planets = player.getPlanets();
    Map<PlanetTrait, Integer> traitCount = new HashMap<>();
    for (Planet planet : planets) {
      List<PlanetTrait> traits = planet.getTraits();
      if(trait.isPresent()) {
        PlanetTrait toCount = trait.get();
        if(traitCount.containsKey(toCount))  {
          Integer number = traitCount.get(toCount);
          number += 1;
          traitCount.put(toCount, number);
        } else {
          traitCount.put(toCount, 1);
        }
      }
    }
    int matchCount = 0;
    for (Integer count : traitCount.values()) {
      if(count > matchCount) {
        matchCount = count;
      }
    }
    return getPercentage(4, matchCount);
  }),
  //  Develop Weaponry  Own 2 unit upgrade technologies   1
  DEVELOP_WEAPONARY((game, player) -> {
    return getPercentage(2, player.getUnitUpgradeTechnologies().size());
  }),
  //  Diversify Research  Own 2 technologies in each of 2 colors  1
  DIVERSIFY_RESEARCH((game, player) -> {
    List<Technology> technologies = player.getTechnologies();

    Map<TechnologyType, List<Technology>> techByType2 = new HashMap<>();
    for(Technology tech : technologies ){
      TechnologyType techType = tech.getTechType();
      if(techByType2.containsKey(techType)) {
        techByType2.get(techType).add(tech);
      } else {
        List<Technology> techs = new ArrayList<Technology>();
        techs.add(tech);
        techByType2.put(techType, techs);
      }
    }
    int matchCount = 0;
    //Wenn wir keine mit Size 2 haben, 
    final List<Integer> numberOfTechs = techByType2.values().stream().map(techs -> techs.size()).collect(Collectors.toList());
    Collections.sort(numberOfTechs, Collections.reverseOrder()); 
    numberOfTechs.get(0);
    for(List<Technology> items : techByType2.values()) {
      if(items.size() >= 2) {
        matchCount += 2;
      } else if(items.size() == 1) {
        matchCount += 1;
      }
    }

    return getPercentage(4, matchCount);
  }),
  //  Erect a Monument  Spend 8 resources   1  
  ERECT_A_MONUMENT((game, player) -> {
    return getPercentage(8, player.getRessources());
  }),
  //  Expand Borders  Control 6 planets in non-home systems   1
  EXPAND_BORDERS((game, player) -> {
    return getPercentage(6, player.getNonHomeSystemPlanets().size());
  }),
  //  Found Research Outposts   Control 3 planets that have technology specialties  1
  FOUND_RESEARCH_OUTPOSTS((game, player) -> {
    List<Planet> planetsWithTechSpecialty = player.getPlanets().stream().filter(planet -> planet.hasTechspecialty()).collect(Collectors.toList());
    int matchCount = planetsWithTechSpecialty.size();
    return getPercentage(3, matchCount);
  }),
  //  Lead From the Front   Spend a total of 3 tokens from your tactic and/or strategy pools  1
  LEAD_FROM_THE_FRONT((game, player) -> {
    return getPercentage(3, player.getStrategyPool()+player.getTacticPool());
  }), 
  //  Negotiate Trade Routes  Spend 5 trade goods   1
  NEGOTIATE_TRADE_ROUTES((game, player) -> {
    return getPercentage(5, player.getTradeGoods());

  }), 
  //  Sway the Council    Spend 8 influence   1
  SWAY_THE_COUNCIL((game, player) -> {
    return getPercentage(8, player.getInfluence());
  }),
  //  Amass wealth  Spend 3 influence, 3 resources and 3 trade goods  1
  //FIXME: Das hier ist noch falsch!
  AMASS_WEALTH((game, player) -> {
    return getPercentage(9, player.getInfluence() + player.getTradeGoods()+player.getRessources());
  }), 
  //Centralize Galactic Trade   Spend 10 trade goods  2
  CENTRALIZE_GALACTIC_TRADE((game, player) -> {
    return getPercentage(10, player.getTradeGoods());
  }),
  //Found a Golden Age  Spend 16 resources  2
  FOUND_A_GOLDEN_AGE((game, player) -> {
    return getPercentage(16, player.getRessources());
  }),
  //Manipulate Galactic Law   Spend 16 influence  2
  MANIPULATE_GALACTIC_LAW((game, player) -> {
    return getPercentage(16, player.getInfluence());
  }),
  //Galvanize the People  Spend a total of 6 tokens from your tactic and/or strategy pools  2
  GALVANIZE_THE_PEOPLE((game, player) -> {
    return getPercentage(6, player.getTacticPool() + player.getStrategyPool());
  }), 
  //Subdue the Galaxy   Control 11 planets in non-home systems  2
  SUBDUE_THE_GALAXY((game, player) -> {
    return getPercentage(11, player.getNonHomeSystemPlanets().size());
  }),
  //Conquer the Weak    Control 1 planet that is in another player's home system  2
  //FIXME: Kein guter Weg um den Fortschritt zu diesem Ziel zu messen
  CONQUER_THE_WEAK((game, player) -> {
    return getPercentage(1, player.getHomeSystemPlanets().size());
  })
  ;

  private BiFunction<Game, Player, Integer> checkLogic;
  private boolean completed;

  private Objectives(BiFunction<Game, Player, Integer> checkLogic) {
    this.checkLogic = checkLogic;
  }

  private static int getPercentage(int maxCompletion, int matchCount) {
    if (matchCount >= maxCompletion) {
      return Integer.valueOf(100);
    }
    return 100 * matchCount / maxCompletion;
  }

  public int check(Game game, Player player) {
    return checkLogic.apply(game, player);
  }
}

//  Intimidate Council  Have 1 or more ships in 2 systems that are adjacent to Mecatol Rex's System   1
//  Build Defenses  Have 4 or more structures (on the game board)   1
//  Discover Lost Outposts  Control 2 planets that have attachments   1
//  Engineer a Marvel   Have your flagship or a war sun on the game board   1
//  Explore Deep Space  Have units in 3 systems that do not contain planets   1
//  Improve Infrastructure  Have structures on 3 planets outside of your home system  1
//  Make History  Have units in 2 systems that contain legendary planets, Mecatol Rex or anomalies  1
//  Populate the Outer Rim  Have units in 3 systems on the edge of the game board (other than your home system)   1
//  Push Boundaries   Control more planets than each of 2 of your neighbors   1
//  Raise a Fleet   Have 5 or more non-fighter ships in one system  1

//  Stage 2:


//    Form Galactic Brain Trust   Control 5 planets that have technology specialties  2



//    Master the Sciences   Own 2 technologies in each of 4 colors  2
//    Revolutionize Warfare   Own 3 unit upgrade technologies   2

//    Unify the Colonies  Control 6 planets that each have the same planet trait  2

//  Achieve Supremacy   Have your flagship or a war sun in another player's home system or the Mecatol Rex system   2
//  Become a Legend   Have units in 4 systems that contain legendary planets, Mecatol Rex, or anomalies   2
//  Command an Armada   Have 8 or more non-fighter ships in 1 system  2
//  Construct Massive Cities  Have 7 or more structures (on the game board)   2
//  Control the Borderlands   Have unit in 5 systems on the edge of the game board (other than your home system)  2
//  Hold Vast Reserves  Spend 6 influence, 6 resources and 6 trade goods  2
//  Patrol Vast Territories   Have units in 5 systems that do not contain planets   2
//  Protect the Border  Have structures on 5 planets outside of your home system  2
//  Reclaim Ancient Monuments   Control 3 planets that have attachments   2
//  Rule Distant Lands  Control 2 planets that are each in or adjacent to a different, other player's home system
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemInfo {
  
    private static Map<Integer, List<Location>> systems = new HashMap<>();
    
    static {
      systems.put(19,List.of(new Planet("Wellon",1,2,TechnologyType.YELLOW,PlanetTrait.INDUSTRIAL)));
      systems.put(20,List.of(new Planet("Vefut II", 2,2,PlanetTrait.HAZARDOUS)));
      systems.put(21,List.of(new Planet("Thibah", 1,1,TechnologyType.BLUE,PlanetTrait.INDUSTRIAL)));
      systems.put(22,List.of(new Planet("TarMann", 1,1,TechnologyType.GREEN,PlanetTrait.INDUSTRIAL)));
      systems.put(23,List.of(new Planet("Saudor", 2,2,PlanetTrait.INDUSTRIAL)));
      systems.put(24,List.of(new Planet("Mehar Xull", 1,3,TechnologyType.RED,PlanetTrait.HAZARDOUS)));
      systems.put(25,List.of(new Planet("Quann", 2,1,PlanetTrait.CULTURAL),new Wormhole("beta")));
      systems.put(26,List.of(new Planet("Lodor", 3,1,PlanetTrait.CULTURAL),new Wormhole("alpha")));
      systems.put(27,List.of(new Planet("New Albion", 1,1,TechnologyType.GREEN,PlanetTrait.INDUSTRIAL	),new Planet("Starpoint",3,1,PlanetTrait.HAZARDOUS)));
      systems.put(28,List.of(new Planet("Tequran", 2,0,PlanetTrait.HAZARDOUS),new Planet("Torkan", 0,3,PlanetTrait.CULTURAL)));
      systems.put(29,List.of(new Planet("Qucenn", 1,2,PlanetTrait.INDUSTRIAL),new Planet("Rarron", 0,3,PlanetTrait.CULTURAL)));
      systems.put(30,List.of(new Planet("Mellon", 0,2,PlanetTrait.CULTURAL),new Planet("Zohbat", 3,1,PlanetTrait.HAZARDOUS)));
      systems.put(31,List.of(new Planet("Lazar", 1,0,TechnologyType.YELLOW,PlanetTrait.INDUSTRIAL),new Planet("Sakulag", 2,1,PlanetTrait.HAZARDOUS)));
      systems.put(32,List.of(new Planet("Dal Bootha", 0,2,PlanetTrait.CULTURAL),new Planet("Xxehan", 1,1,PlanetTrait.CULTURAL)));
      systems.put(33,List.of(new Planet("Corneeq", 1,2,PlanetTrait.CULTURAL),new Planet("Resculon", 2,0,PlanetTrait.CULTURAL)));
      systems.put(34,List.of(new Planet("Centauri", 1,3,PlanetTrait.CULTURAL),new Planet("Gral", 1,1,TechnologyType.BLUE,PlanetTrait.INDUSTRIAL)));
      systems.put(35,List.of(new Planet("Bereg", 3,1,PlanetTrait.HAZARDOUS),new Planet("Lirta IV", 2,3,PlanetTrait.HAZARDOUS)));
      systems.put(36,List.of(new Planet("Arnor", 1,2,PlanetTrait.INDUSTRIAL),new Planet("Lor", 2,1,PlanetTrait.INDUSTRIAL)));
      systems.put(37,List.of(new Planet("Arinam", 1,2,PlanetTrait.INDUSTRIAL),new Planet("Meer", 0,4,TechnologyType.RED,PlanetTrait.HAZARDOUS)));
      systems.put(38,List.of(new Planet("Abyz", 3,0,PlanetTrait.HAZARDOUS	),new Planet("Fria", 2,0,PlanetTrait.HAZARDOUS)));
      systems.put(39,List.of(new Wormhole("alpha")));
      systems.put(40,List.of(new Wormhole("beta")));
      systems.put(41,List.of(new GravityRift()));		
      systems.put(42,List.of(new Nebula()));
      systems.put(43,List.of(new Supernova()));
      systems.put(44,List.of(new AstroidField()));
      systems.put(45,List.of(new AstroidField()));
      systems.put(46,new ArrayList<Location>());
      systems.put(47,new ArrayList<Location>());
      systems.put(48,new ArrayList<Location>());
      systems.put(49,new ArrayList<Location>());
      systems.put(50,new ArrayList<Location>());
      systems.put(59,List.of(new Planet("Archon Vail", 1,3,TechnologyType.BLUE,PlanetTrait.HAZARDOUS)));
      systems.put(60,List.of(new Planet("Perimeter", 2,1,PlanetTrait.INDUSTRIAL)));
      systems.put(61,List.of(new Planet("Ang",  2,0,TechnologyType.RED,PlanetTrait.INDUSTRIAL)));
      systems.put(62,List.of(new Planet("Sem,Lore", 3,2,TechnologyType.YELLOW,PlanetTrait.CULTURAL)));
      systems.put(63,List.of(new Planet("Vorhal", 0,2,TechnologyType.GREEN,PlanetTrait.CULTURAL)));
      systems.put(64,List.of(new Planet("Atlas", 3,1,PlanetTrait.HAZARDOUS),new Wormhole("beta")));
      systems.put(65,List.of(new Planet("Primor", 2,1, new PlanetTrait[] {PlanetTrait.CULTURAL,PlanetTrait.LEGENDARY})));	
      systems.put(66,List.of(new Planet("Hopes End", 3,0,PlanetTrait.HAZARDOUS,PlanetTrait.LEGENDARY)));		
      systems.put(67,List.of(new Planet("Cormund", 2,0,PlanetTrait.HAZARDOUS),new GravityRift()));	
      systems.put(68,List.of(new Planet("Everra", 3,1,PlanetTrait.CULTURAL), new Nebula()));	
      systems.put(69,List.of(new Planet("Accoen", 2,3,PlanetTrait.INDUSTRIAL),new Planet("Joel Ir", 2,3,PlanetTrait.INDUSTRIAL)));	
      systems.put(70,List.of(new Planet("Kraag", 2,1,PlanetTrait.HAZARDOUS),new Planet("Siig", 0,2,PlanetTrait.HAZARDOUS)));
      systems.put(71,List.of(new Planet("Alio Prima", 1,1,PlanetTrait.CULTURAL),new Planet("Bakal", 3,2,PlanetTrait.INDUSTRIAL)));
      systems.put(72,List.of(new Planet("Lisis", 2,2,PlanetTrait.INDUSTRIAL),new Planet("Velnor", 2,1,TechnologyType.RED,PlanetTrait.INDUSTRIAL)));
      systems.put(73,List.of(new Planet("Cealdri", 0,2,TechnologyType.YELLOW,PlanetTrait.CULTURAL),new Planet("Xanhact", 0,1,PlanetTrait.HAZARDOUS)));
      systems.put(74,List.of(new Planet("Vega Major", 2,1,PlanetTrait.CULTURAL),new Planet("Vega Minor", 1,2,TechnologyType.BLUE,PlanetTrait.CULTURAL)));
      systems.put(75,List.of(new Planet("Abaddon", 1,0,PlanetTrait.CULTURAL),new Planet("Ashtroth", 2,0,PlanetTrait.HAZARDOUS),new Planet("Loki", 1,2,PlanetTrait.CULTURAL)));
      systems.put(76,List.of(new Planet("Rigel I", 0,1,PlanetTrait.HAZARDOUS),new Planet("Rigel II", 1,2,PlanetTrait.INDUSTRIAL),new Planet("Rigel III", 1,1,TechnologyType.GREEN,PlanetTrait.INDUSTRIAL)));
      systems.put(77,new ArrayList<Location>());
      systems.put(78,new ArrayList<Location>());
      systems.put(79,List.of(new Wormhole("alpha"),new AstroidField()));
      systems.put(80,List.of(new Supernova()));
      systems.put(5,List.of(new Planet("Nestphar", 3,2,PlanetTrait.HOMEWORLD)));		
      systems.put(10,List.of(new Planet("Arc Prime", 4,0,PlanetTrait.HOMEWORLD),new Planet("Wren Terra", 2,1,PlanetTrait.HOMEWORLD)));
      systems.put(11,List.of(new Planet("Lisis II", 1,0,PlanetTrait.HOMEWORLD),new Planet("Ragh", 2,1,PlanetTrait.HOMEWORLD)));
      systems.put(4,List.of(new Planet("Muaat", 4,1,PlanetTrait.HOMEWORLD)));		
      systems.put(16,List.of(new Planet("Hercant", 1,1,PlanetTrait.HOMEWORLD),new Planet("Arretze", 2,0,PlanetTrait.HOMEWORLD),new Planet("Kamdorn", 0,1,PlanetTrait.HOMEWORLD)));
      systems.put(1,List.of(new Planet("Jord", 4,2,PlanetTrait.HOMEWORLD)));		
      systems.put(51,List.of(new Planet("Creuss", 4,2,PlanetTrait.HOMEWORLD), new Wormhole("gamma")));	
      systems.put(17,List.of(new Wormhole("gamma")));
      systems.put(6,List.of(new Planet("[0.0.0]", 5,0,PlanetTrait.HOMEWORLD)));		
      systems.put(2,List.of(new Planet("Moll Primus", 4,1,PlanetTrait.HOMEWORLD)));
      systems.put(9,List.of(new Planet("Druaa", 3,1,PlanetTrait.HOMEWORLD),new Planet("Maaluuk", 0,2,PlanetTrait.HOMEWORLD)));
      systems.put(8,List.of(new Planet("Mordai II", 4,0,PlanetTrait.HOMEWORLD)));
      systems.put(13,List.of(new Planet("TrenLak", 1,0,PlanetTrait.HOMEWORLD),new Planet("Quinarra", 3,1,PlanetTrait.HOMEWORLD)));
      systems.put(12,List.of(new Planet("Jol", 1,2,PlanetTrait.HOMEWORLD),new Planet("Nar", 2,3,PlanetTrait.HOMEWORLD)));
      systems.put(7,List.of(new Planet("Winnu", 3,4,PlanetTrait.HOMEWORLD)));
      systems.put(14,List.of(new Planet("Archon Ren", 2,3,PlanetTrait.HOMEWORLD),new Planet("Archon Tau", 1,1,PlanetTrait.HOMEWORLD)));
      systems.put(3,List.of(new Planet("Darien", 4,4,PlanetTrait.HOMEWORLD)));		
      systems.put(15,List.of(new Planet("Retillion", 2,3,PlanetTrait.HOMEWORLD),new Planet("Shalloq", 1,2,PlanetTrait.HOMEWORLD)));	
      systems.put(58,List.of(new Planet("Valk", 2,0,PlanetTrait.HOMEWORLD),new Planet("Avar", 1,1,PlanetTrait.HOMEWORLD),new Planet("Ylir", 0,2,PlanetTrait.HOMEWORLD)));
      systems.put(56,List.of(new Planet("The Dark", 3,4,PlanetTrait.HOMEWORLD), new Nebula()));
      systems.put(52,List.of(new Planet("Ixth", 3,5,PlanetTrait.HOMEWORLD)));
      systems.put(57,List.of(new Planet("Naazir", 2,1,PlanetTrait.HOMEWORLD),new Planet("Rokha", 1,2,PlanetTrait.HOMEWORLD)));
      systems.put(53,List.of(new Planet("Arcturus", 4,4,PlanetTrait.HOMEWORLD)));
      systems.put(55,List.of(new Planet("Elysium", 4,1,PlanetTrait.HOMEWORLD)));
      systems.put(54,List.of(new Planet("Acheron", 4,0,PlanetTrait.HOMEWORLD)));	
      systems.put(82,List.of(new Planet("Malice", 0,3,PlanetTrait.CULTURAL,PlanetTrait.LEGENDARY)));
//new Planet("Mirage", 1,2,PlanetTrait.CULTURAL,PlanetTrait.LEGENDARY));
    }
      
    public static List<Location> getLocations(int id) {
      return systems.get(id);
    }
  }
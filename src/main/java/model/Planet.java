package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import model.TechnologyType;

public class Planet implements Location {

  private int id;
  private String name;
  private Integer ressources;
  private Integer influence;
  private Integer systemId;
  private List<PlanetTrait> traits = new ArrayList<>();
  private TechnologyType technologyType;
  private boolean exhausted;
  private System system;
  private Player home;

  public Planet(String name, Integer ressources, Integer influence, TechnologyType techType, PlanetTrait... traits) {
    this.name = name;
    this.ressources = ressources;
    this.influence = influence;
    this.technologyType = techType;
    this.traits = List.of(traits);
  }

  public Planet(String name, Integer ressources, Integer influence, PlanetTrait... traits) {
    this.name = name;
    this.ressources = ressources;
    this.influence = influence;
    this.traits = List.of(traits);
  }

  public Planet(String name, Integer ressources, Integer influence, PlanetTrait trait) {
    this.name = name;
    this.ressources = ressources;
    this.influence = influence;
    this.traits = List.of(trait);
  }


  public Planet(String name, Integer ressources, Integer influence, Integer systemId) {
    this.name = name;
    this.ressources = ressources;
    this.influence = influence;
    this.systemId = systemId;
  }


  public Planet(String name, Integer ressources, Integer influence, System system) {
    this.name = name;
    this.ressources = ressources;
    this.influence = influence;
    this.system = system;
  }

  public List<PlanetTrait> getTraits() {
    return traits;
  }

  public void addTrait(PlanetTrait trait) {
    this.traits.add(trait);
  }


  public Integer getRessources() {
    return ressources;
  }

  public boolean isExhausted() {
    return exhausted;
  }

  public Integer getInfluence() {
    return influence;
  }
  
  public System getSystem() {
    return system;
  }

  public String getName() {
    return name;
  }


  public boolean hasTechspecialty() {
    return technologyType != null;
  }

  public void setTechnologyType(TechnologyType technologyType) {
    this.technologyType = technologyType;
  }
}












/* Generierte Planet 

Quelle: https://docs.google.com/spreadsheets/d/1IxHdG1hB0CgcXFAB2D_ePcEuYf9VVcYlUte_6hxFtFg/edit#gid=0

Nimbletext Pattern: new Planet("$0",System.$1,PlanetTrait.<%$2.toUpperCase()%>,$3,$4,$5);

new Planet("Abyz",System.AbyzFria,PlanetTrait.HAZARDOUS,3,0,null);
new Planet("Arinam",System.ArinamMeer,PlanetTrait.INDUSTRIAL,1,2,null);
new Planet("Arnor",System.ArnorLor,PlanetTrait.INDUSTRIAL,2,1,null);
new Planet("Bereg",System.BeregLirta,PlanetTrait.HAZARDOUS,3,1,null);
new Planet("Centauri",System.CentauriGral,PlanetTrait.CULTURAL,1,3,null);
new Planet("Coorneeq",System.CoorneeqResculon,PlanetTrait.CULTURAL,1,2,null);
new Planet("Dal Bootha",System.DalBoothaXXehan,PlanetTrait.CULTURAL,0,2,null);
new Planet("Fria",System.AbyzFria,PlanetTrait.HAZARDOUS,2,0,null);
new Planet("Gral",System.CentauriGral,PlanetTrait.INDUSTRIAL,1,1,Blue);
new Planet("Lazar",System.LazarSakulag,PlanetTrait.INDUSTRIAL,1,0,Yellow);
new Planet("Lirta IV",System.BeregLirta,PlanetTrait.HAZARDOUS,2,3,null);
new Planet("Lodor",System.,PlanetTrait.CULTURAL,3,1,null);
new Planet("Lor",System.ArnorLor,PlanetTrait.INDUSTRIAL,1,2,null);
new Planet("Meer",System.ArinamMeer,PlanetTrait.HAZARDOUS,0,4,Red);
new Planet("Mehar Xull",System.Mehar Xull,PlanetTrait.HAZARDOUS,1,3,Red);
new Planet("Mellon",System.MellonZohbat,PlanetTrait.CULTURAL,0,2,null);
new Planet("New Albion",System.NewAlbionStarpoint,PlanetTrait.INDUSTRIAL,1,1,Green);
new Planet("Quann",System.,PlanetTrait.CULTURAL,2,1,null);
new Planet("Qucen'n",System.QuecenNRarron,PlanetTrait.INDUSTRIAL,1,2,null);
new Planet("Rarron",System.QuecenNRarron,PlanetTrait.CULTURAL,0,3,null);
new Planet("Resculon",System.CoorneeqResculon,PlanetTrait.CULTURAL,2,0,null);
new Planet("Sakulag",System.LazarSakulag,PlanetTrait.HAZARDOUS,2,1,null);
new Planet("Saudor",System.,PlanetTrait.INDUSTRIAL,2,2,null);
new Planet("Starpoint",System.NewAlbionStarpoint,PlanetTrait.HAZARDOUS,3,1,null);
new Planet("Tar'Mann",System.,PlanetTrait.INDUSTRIAL,1,1,Green);
new Planet("Tequ'ran",System.TorkanTequ'Ran,PlanetTrait.HAZARDOUS,2,0,null);
new Planet("Thibah",System.,PlanetTrait.INDUSTRIAL,1,1,Blue);
new Planet("Torkan",System.TorkanTequ'Ran,PlanetTrait.CULTURAL,0,3,null);
new Planet("Vefut II",System.,PlanetTrait.HAZARDOUS,2,2,null);
new Planet("Wellon",System.,PlanetTrait.INDUSTRIAL,1,2,Yellow);
new Planet("XXehan",System.DalBoothaXXehan,PlanetTrait.CULTURAL,1,1,null);
new Planet("Zohbat",System.MellonZohbat,PlanetTrait.HAZARDOUS,3,1,null);
new Planet("NestPhar",System.Arborec,PlanetTrait.NULL,3,2,null);
new Planet("Creuss",System.Creuss,PlanetTrait.NULL,4,2,null);
new Planet("Hercant",System.Hacan,PlanetTrait.NULL,1,1,null);
new Planet("Arretze",System.Hacan,PlanetTrait.NULL,2,0,null);
new Planet("Kamdorn",System.Hacan,PlanetTrait.NULL,0,1,null);
new Planet("Jol",System.Jol-Nar,PlanetTrait.NULL,1,2,null);
new Planet("Nar",System.Jol-Nar,PlanetTrait.NULL,2,3,null);
new Planet("[0.0.0]",System.L1Z1x,PlanetTrait.NULL,5,0,null);
new Planet("Arc Prime",System.Letnev,PlanetTrait.NULL,4,0,null);
new Planet("Wren Terra",System.Letnev,PlanetTrait.NULL,2,1,null);
new Planet("Moll Primus",System.Mentak,PlanetTrait.NULL,4,1,null);
new Planet("Muuat",System.Muaat,PlanetTrait.NULL,4,1,null);
new Planet("Druaa",System.Naalu,PlanetTrait.NULL,3,1,null);
new Planet("Maaluuk",System.Naalu,PlanetTrait.NULL,0,2,null);
new Planet("Mordai II",System.Nekro Virus,PlanetTrait.NULL,4,0,null);
new Planet("Lisis II",System.Saar,PlanetTrait.NULL,1,0,null);
new Planet("Ragh",System.Saar,PlanetTrait.NULL,2,1,null);
new Planet("Tren'Lak",System.Sardakk N'orr,PlanetTrait.NULL,1,0,null);
new Planet("Quinarra",System.Sardakk N'orr,PlanetTrait.NULL,3,1,null);
new Planet("Jord",System.Sol,PlanetTrait.NULL,4,2,null);
new Planet("Winnu",System.Winnu,PlanetTrait.NULL,3,4,null);
new Planet("Archon Wren",System.Xxcha,PlanetTrait.NULL,2,3,null);
new Planet("Archon Tau",System.Xxcha,PlanetTrait.NULL,1,1,null);
new Planet("Darien",System.Yin,PlanetTrait.NULL,4,4,null);
new Planet("Retillion",System.Yssaril,PlanetTrait.NULL,2,3,null);
new Planet("Shalloq",System.Yssaril,PlanetTrait.NULL,1,2,null);
new Planet("Mecatol Rex",System.Mecatol Rex,PlanetTrait.NULL,1,6,null);
 */

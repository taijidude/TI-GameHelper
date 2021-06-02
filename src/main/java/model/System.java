package model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Map Strings als Id
 */

public class System {

  private int id;
  //private Player controls;
  //private Player home;
  //Mecatol
  //Anomaly
  //Wormhole
  private List<Location> locations;
  private List<Integer> neighbors;


  public void setId(int id) {
    this.id = id;
    locations = SystemInfo.getLocations(id);
  }

  public int getId() {
    return id;
  }

  public List<Integer> getNeighbors() {
    return neighbors;
  }

  public void setNeighbors(List<Integer> neighbors) {
    this.neighbors = neighbors;
  }

  public List<Location> getLocations() {
    return locations;
  }


  public boolean isHomeSystem() {
    return true;
    //return home != null;
  }
}
/* Generierte Systeme

Quelle: 

public enum SYSTEM {
   ABYZFRIA,
   ARINAMMEER,
   ARNORLOR,
   BEREGLIRTA,
   CENTAURIGRAL,
   COORNEEQRESCULON,
   DALBOOTHAXXEHAN,
   LAZARSAKULAG,
   MEHAR XULL,
   MELLONZOHBAT,
   NEWALBIONSTARPOINT,
   QUECENNRARRON,
   TORKANTEQU'RAN,
   ARBOREC,
   CREUSS,
   HACAN,
   JOL-NAR,
   L1Z1X,
   LETNEV,
   MENTAK,
   MUAAT,
   NAALU,
   NEKRO VIRUS,
   SAAR,
   SARDAKK N'ORR,
   SOL,
   WINNU,
   XXCHA,
   YIN,
   YSSARIL,
   MECATOL REX
}





*/
package model;


public class Technology {

  private String name;
  private Integer level;
  private TechnologyType techtype;
  private boolean unitUpgrade;
  private boolean factiontech;

  public Technology(String name, Integer level, TechnologyType techtype, boolean unitUpgrade, boolean factiontech) {
    this.name = name;
    this.level = level;
    this.techtype = techtype;
    this.unitUpgrade = unitUpgrade;
    this.factiontech = factiontech;

  }

  /**
   * Liefert den Wert von unitUpgrade vom Typ boolean zur�ck
   *
   * @return unitUpgrade vom Typ boolean
   */
  public boolean isUnitUpgrade() {
    return unitUpgrade;
  }

  public void setUnitUpgrade(boolean unitUpgrade) {
    this.unitUpgrade = unitUpgrade;
  }

  /**
   * Liefert den Wert von techtype vom Typ TechnologyType zur�ck
   *
   * @return techtype vom Typ TechnologyType
   */
  public TechnologyType getTechType() {
    return techtype;
  }


}

package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
    private Game game;
    private Player player;

    //Declaring this here should save me typing
    private int actual; 

    @Before
    public void setup() {
        game = new Game("Testgame");
        player = new Player("Spieler");
        actual = 0;
    }

    @Test
    public void CORNER_THE_MARKET() {
        Planet p1 = new Planet("p1", 0, 0, new System());
        p1.addTrait(PlanetTrait.CULTURAL);
        Planet p2 = new Planet("p2", 0, 0, new System());
        p2.addTrait(PlanetTrait.CULTURAL);
        Planet p3 = new Planet("p2", 0, 0, new System());
        p3.addTrait(PlanetTrait.CULTURAL);
        player.addPlanets(p1, p2, p3);
        actual = Objectives.CORNER_THE_MARKET.check(game, player);
        assertEquals(75, actual);

        p1 = new Planet("p1", 0, 0, new System());
        p1.addTrait(PlanetTrait.CULTURAL);
        p2 = new Planet("p2", 0, 0, new System());
        p2.addTrait(PlanetTrait.CULTURAL);
        p3 = new Planet("p2", 0, 0, new System());
        p3.addTrait(PlanetTrait.CULTURAL);
        Planet p4 = new Planet("p2", 0, 0, new System());
        p4.addTrait(PlanetTrait.CULTURAL);
        player.addPlanets(p4); 
        actual = Objectives.CORNER_THE_MARKET.check(game, player);
        assertEquals(100, actual);
    }

    @Test
    public void DEVELOP_WEAPONARY() {
        Technology t1 = new Technology("t1",1, TechnologyType.BLUE, true, false);
        t1.setUnitUpgrade(true);
        Technology t2 = new Technology("t2",1, TechnologyType.BLUE, false, false);;
        t2.setUnitUpgrade(false);
        player.addTechnologies(t1, t2);
        actual = Objectives.DEVELOP_WEAPONARY.check(game, player);
        assertEquals(50, actual);
        t2.setUnitUpgrade(true);
        actual = Objectives.DEVELOP_WEAPONARY.check(game, player);
        assertEquals(100, actual);
    }

    @Test 
    public void DIVERSIFY_RESEARCH() {
        player.addTechnologies(new Technology("t1",1,TechnologyType.GREEN, false,  false));
        player.addTechnologies(new Technology("t2",1,TechnologyType.GREEN, false,  false));
        actual = Objectives.DIVERSIFY_RESEARCH.check(game, player);
        assertEquals(50, actual);
        player.addTechnologies(new Technology("t3",1,TechnologyType.BLUE, false,  false));
        player.addTechnologies(new Technology("t4",1,TechnologyType.BLUE, false,  false));
        actual = Objectives.DIVERSIFY_RESEARCH.check(game, player);
        assertEquals(100, actual);
    }

    @Test 
    public void FOUND_RESEARCH_OUTPOSTS() {
        Planet p1 = new Planet("p1", 0, 0, new System());
        p1.setTechnologyType(TechnologyType.BLUE);
        Planet p2 = new Planet("p2", 0, 0, new System());
        p2.setTechnologyType(TechnologyType.GREEN);
        Planet p3 = new Planet("p3", 0, 0, new System());
        player.addPlanets(p1, p2, p3);
        actual = Objectives.FOUND_RESEARCH_OUTPOSTS.check(game, player);
        assertEquals(66, actual);
        p3.setTechnologyType(TechnologyType.GREEN);
        actual = Objectives.FOUND_RESEARCH_OUTPOSTS.check(game, player);
        assertEquals(100, actual);
    }    

    @Test 
    public void EXPAND_BORDERS() {
        Planet p1 = new Planet("p1", 0, 0, new System());
        Planet p2 = new Planet("p2", 0, 0, new System());
        Planet p3 = new Planet("p3", 0, 0, new System());
        Planet p4 = new Planet("p4", 0, 0, new System());
        Planet p5 = new Planet("p5", 0, 0, new System());
        
        player.addPlanets(p1,p2,p3,p4,p5);
        actual = Objectives.EXPAND_BORDERS.check(game, player);
        assertEquals(83, actual);
        player.addPlanets(new Planet("p6", 0, 0, new System()));
        actual = Objectives.EXPAND_BORDERS.check(game, player);
        assertEquals(100, actual);
    }

    @Test 
    public void ERECT_A_MONUMENT() {
        Planet p1 = new Planet("p1", 3, 0, new System());    
        Planet p2 = new Planet("p2", 3, 0, new System());
        player.addPlanets(p1, p2);
        actual = Objectives.ERECT_A_MONUMENT.check(game, player);
        assertEquals(75, actual);
        Planet p3 = new Planet("p2", 3, 0, new System());
        player.addPlanets(p3);
        actual = Objectives.ERECT_A_MONUMENT.check(game, player);
        assertEquals(100, actual);
    }

    @Test
    public void LEAD_FROM_THE_FRONT(){
        player.setStrategyPool(1);
        player.setTacticPool(1);
        actual = Objectives.LEAD_FROM_THE_FRONT.check(game, player);
        assertEquals(66, actual);
        player.setStrategyPool(3);
        player.setTacticPool(1);
        actual = Objectives.LEAD_FROM_THE_FRONT.check(game, player);
        assertEquals(100, actual);        
    }
    @Test
    public void NEGOTIATE_TRADE_ROUTES() {
        player.setTradeGoods(4);
        actual = Objectives.NEGOTIATE_TRADE_ROUTES.check(game, player);
        assertEquals(80, actual);
        player.setTradeGoods(5);
        actual = Objectives.NEGOTIATE_TRADE_ROUTES.check(game, player);
        assertEquals(100, actual);
    }
}
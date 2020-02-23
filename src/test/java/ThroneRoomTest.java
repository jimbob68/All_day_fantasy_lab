import Castle.Dungeon;
import Castle.ThroneRoom;
import Players.Barbarian;
import Players.Dwarf;
import Players.Knight;
import Players.Wizard;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThroneRoomTest {

    ThroneRoom throneRoom;
    Orc orc;
    Barbarian barbarian;
    Knight knight;
    Dwarf dwarf;
    Wizard wizard;

    @Before
    public void before(){
        throneRoom = new ThroneRoom("Throne Room");
        orc = new Orc("Pork", 30, 50);
        barbarian = new Barbarian("Steve", 50, 20, 30, 30, 20);
        knight = new Knight("Chris", 80, 20,40, 20, 20);
        dwarf = new Dwarf ("Gary", 60, 10, 50, 30, 20);
        wizard = new Wizard("Gandalf", 80, 60, 80, 20, 30);
    }

    @Test
    public void hasName(){
        assertEquals("Throne Room", throneRoom.getName());
    }

    @Test
    public void checkRoomHasNoEnemyToBegin(){
        assertEquals(0, throneRoom.numberOfEnemies());
    }

    @Test
    public void checkCanAddOrcToRoom(){
        throneRoom.addOrc(orc);
        assertEquals(1, throneRoom.numberOfEnemies());
    }

    @Test
    public void checkCanRemoveOrcFromRoom(){
        throneRoom.addOrc(orc);
        throneRoom.removeOrc(orc);
        assertEquals(0, throneRoom.numberOfEnemies());
    }

    @Test
    public void checkRoomBeginsEmptyOfPlayers(){
        assertEquals(0, throneRoom.numberOfPlayers());
    }

    @Test
    public void checkCanAddBarbarianToRoom(){
        throneRoom.addBarbarian(barbarian);
        assertEquals(1, throneRoom.numberOfPlayers());
    }

    @Test
    public void checkCanAddKnightToRoom(){
        throneRoom.addKnight(knight);
        assertEquals(1, throneRoom.numberOfPlayers());
    }

    @Test
    public void checkCanAddDwarfToRoom(){
        throneRoom.addDwarf(dwarf);
        assertEquals(1, throneRoom.numberOfPlayers());
    }
//    @Test
//    public void checkCanAddBasiliskToRoomWhenPlayerAndEnemyPresent(){
//        throneRoom.addBasilisk(basilisk);
//        throneRoom.addDwarf(dwarf);
//        throneRoom.addOrc(orc);
//        assertEquals(1, throneRoom.);
//    }

    @Test
    public void checkDwarfChallengesEnemyWhenEnteringRoomWithEnemy(){
        throneRoom.addOrc(orc);
        assertEquals("I challenge thee to mortal battle", throneRoom.addDwarf(dwarf));
    }
    @Test
    public void checkDwarfDoesNotChallengeEnemyWhenRoomIsEmpty(){
        assertEquals(null, throneRoom.addDwarf(dwarf));
    }

//    @Test
//    public void checkDwarfCanAttackOrc(){
//        throneRoom.addOrc(orc);
//        throneRoom.addDwarf(dwarf);
//        dwarf.attack();
//        assertEquals();
//
//    }

}

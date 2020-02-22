import Players.Knight;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc("Mork", 30, 50);
    }
    @Test
    public void hasName(){
        assertEquals("Mork", orc.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(30, orc.getStrength());
    }

    @Test
    public void hasTreasure(){
       assertEquals(50, orc.getTreasure());
    }

}

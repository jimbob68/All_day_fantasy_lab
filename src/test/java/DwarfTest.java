import Players.Dwarf;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DwarfTest {


    Dwarf dwarf;
    Sword sword;
    Axe axe;
    Bow bow;


    @Before
        public void before(){
        dwarf = new Dwarf("Maximus", 50, 20, 40, 30, 20);
        sword = new Sword(30);
        axe = new Axe(20);
        bow = new Bow(40);
    }
    @Test
        public void hasName(){
        assertEquals("Maximus", dwarf.getName());
    }

    @Test
    public void hasHealingPoints(){
        assertEquals(50, dwarf.getHealingPoints());
    }

    @Test
    public void testWeaponsArrayBeginsEmpty(){
//
        assertEquals(0, dwarf.weaponCount() );
    }
    @Test
    public void testCanAddSword(){
        dwarf.addSword(sword);
        assertEquals(1, dwarf.weaponCount() );
    }

    @Test
    public void testCanAddAxe(){
        dwarf.addAxe(axe);
        assertEquals(1, dwarf.weaponCount() );
    }

    @Test
    public void testCanAddBow(){
        dwarf.addBow(bow);
        assertEquals(1, dwarf.weaponCount());
    }

    @Test
    public void testCanGetAttackStrengthValue(){
        assertEquals(30, dwarf.canGetAttackStrengthValue());
    }
    @Test
    public void testCanGetDefenceStrengthValue(){
       assertEquals(20, dwarf.canGetDefenceStrengthValue());
    }
}

import Players.Wizard;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import Weapons.Wand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Sword sword;
    Axe axe;
    Bow bow;
    Wand wand;

    @Before
    public void before(){
        wizard = new Wizard("Paddy", 30, 50,80, 10, 20);
        sword = new Sword(40);
        axe = new Axe(30);
        bow = new Bow(50);
        wand = new Wand(80);
    }

    @Test
    public void hasName(){
        assertEquals("Paddy", wizard.getName());
    }
    @Test
    public void hasHealingPoints(){
        assertEquals(30, wizard.getHealingPoints());
    }
    @Test
    public void testWeaponsArrayBeginsEmpty(){
      assertEquals(0, wizard.weaponCount());
    }

    @Test
    public void testCanAddWand(){
        wizard.canAddWand(wand);
        assertEquals(1, wizard.weaponCount());
    }

    @Test
    public void testCanAddBow(){
        wizard.canAddBow(bow);
      assertEquals(1, wizard.weaponCount());
    }



}

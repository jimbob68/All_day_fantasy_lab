import Players.Wizard;
import Weapons.Axe;
import Weapons.Bow;
import Weapons.Sword;
import Weapons.Wand;
import org.junit.Before;

public class WizardTest {
    Wizard wizard;
    Sword sword;
    Axe axe;
    Bow bow;
    Wand wand;

    @Before
    public void before(){
        wizard = new Wizard("Paddy", 30);
        sword = new Sword(40);
        axe = new Axe(30);
        bow = new Bow(50);
        wand = new Wand(80);

    }


}

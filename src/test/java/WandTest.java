import Weapons.Wand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WandTest{
   Wand wand;

   @Before
    public void before(){
       wand = new Wand(50);
   }
   @Test
    public void hasStrength(){
       assertEquals(50, wand.getStrength());
   }
}

import mythicalBeasts.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Grizzelda", 60, 40, 50);
    }

    @Test
    public void checkHasName(){
        assertEquals("Grizzelda", dragon.getName());
    }

    @Test
    public void checkHasStrength(){
        assertEquals(60, dragon.getStrength());
    }

    @Test
    public void checkHasRestorativePower(){
        assertEquals(40, dragon.getRestorativePower());
    }

    @Test
    public void checkHasTreasure(){
        assertEquals(50, dragon.getTreasure());
    }
}

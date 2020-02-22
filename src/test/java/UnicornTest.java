import mythicalBeasts.Unicorn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnicornTest {

    Unicorn unicorn;

    @Before
    public void before(){
        unicorn = new Unicorn("Kelsie", 80, 40, 70);
    }

    @Test
    public void checkHasName(){
        assertEquals("Kelsie", unicorn.getName());
    }

    @Test
    public void testHasStrength(){
        assertEquals(80, unicorn.getStrength());
    }

    @Test
    public void testHasRestorativePower(){
        assertEquals(40, unicorn.getRestorativePower());
    }

    @Test
    public void testHasTreasure(){
        assertEquals(70, unicorn.getTreasure());
    }
}

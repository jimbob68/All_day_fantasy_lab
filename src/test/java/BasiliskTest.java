import mythicalBeasts.Basilisk;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasiliskTest {

    Basilisk basilisk;

    @Before
    public void before(){
        basilisk = new Basilisk("Slither", 70, 30,40);
    }

    @Test
    public void checkHasName(){
        assertEquals("Slither", basilisk.getName());
    }

    @Test
    public void checkHasStrength(){
        assertEquals(70, basilisk.getStrength());
    }

    @Test
    public void checkHasRestorativePower(){
        assertEquals(30, basilisk.getRestorativePower());
    }

    @Test
    public void checkHasTreasure(){
        assertEquals(40, basilisk.getTreasure());
    }
}

import mythicalBeasts.Phoenix;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoenixTest {

    Phoenix phoenix;

    @Before
    public void before(){
        phoenix = new Phoenix("Jen", 30, 90, 40);
    }

    @Test
    public void checkHasName(){
        assertEquals("Jen", phoenix.getName());
    }

    @Test
    public void checkHasStrength(){
        assertEquals(30, phoenix.getStrength());
    }

    @Test
    public void checkHasRestorativePowers(){
        assertEquals(90, phoenix.getRestorativePower());
    }

    @Test
    public void checkHasTreasure(){
        assertEquals(40, phoenix.getTreasure());
    }
}

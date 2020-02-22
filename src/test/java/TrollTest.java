import enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll("Stephen", 20, 30);
    }

    @Test
    public void hasName(){
        assertEquals("Stephen", troll.getName());
    }

    @Test
    public void hasStrength(){
        assertEquals(20, troll.getStrength());
    }

    @Test
    public void hasTreasure(){
        assertEquals(30, troll.getTreasure());
    }
}

import enemies.Goblin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoblinTest {

    Goblin goblin;

    @Before
    public void before(){
        goblin = new Goblin("Jamie",10, 20);
    }
    @Test
    public void hasName(){
        assertEquals("Jamie", goblin.getName());
    }
    @Test
    public void hasStrength(){
        assertEquals(10, goblin.getStrength());
    }
    @Test
    public void hasTreasure(){
        assertEquals(20, goblin.getTreasure());
    }
}

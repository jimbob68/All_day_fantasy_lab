import Castle.Rampart;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RampartTest {

    Rampart rampart;

    @Before
    public void before(){
        rampart = new Rampart("Vertigo Heights");
    }

    @Test
    public void testRoomHasName(){
        assertEquals("Vertigo Heights", rampart.getName());
    }
}

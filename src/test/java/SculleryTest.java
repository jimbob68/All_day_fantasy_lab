import Castle.Scullery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SculleryTest {

    Scullery scullery;

    @Before
    public void before(){
        scullery = new Scullery("Roasting Room");
    }

    @Test
    public void testRoomHasName(){
        assertEquals("Roasting Room", scullery.getName());
    }
}

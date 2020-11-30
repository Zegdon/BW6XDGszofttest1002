
import org.junit.Test;
import static org.junit.Assert.*;


public class HaromszogTest {
 
    @Test
    public void tesztSzamitTerulet() {
        assertEquals(525, Haromszog.szamitTerulet(30, 35), 0);        
        assertEquals(900, Haromszog.szamitTerulet(40, 45), 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void tesztExceptionSzamitTerulet() {
        Haromszog.szamitTerulet(0, 35);
    }    
}
package DEVPSLAB.MH1A05A0;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    
    

@Test
public void test() {

    App p = new App();
    assertEquals("Hello DURGA", p.getMessage("DURGA"));

}
@Test
public void testNameEmpty() {

    App c = new App();
    assertEquals("Please provide a name!", c.getMessage(" "));

}
}
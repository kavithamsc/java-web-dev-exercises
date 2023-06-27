package exercises.technology.test;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class ComputerTest {
    private Computer mycomputer;

    @Before
    public void beforeTest(){
        mycomputer = new Computer("Dell", "black", 2023);
    }

    @Test
    public void constructorSetValuesTest(){
        assertEquals("Dell",this.mycomputer.getBrand());
        assertEquals("black",this.mycomputer.getColor());
        assertEquals(2023,this.mycomputer.getYear());
    }
    @Test
    public void twoPlusTwoTurnsFour(){
        int result = mycomputer.processTwoPlusTwo();
        assertEquals(4,result);
    }
}

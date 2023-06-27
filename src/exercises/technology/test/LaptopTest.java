package exercises.technology.test;

import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LaptopTest {
    private Laptop myLaptop;

    @Before
    public void beforeTest(){

        myLaptop = new Laptop("Dell", "black", 2023,true);
    }

    @Test
    public void constructorSetValuesTest(){
        assertEquals("Dell",this.myLaptop.getBrand());
        assertEquals("black",this.myLaptop.getColor());
        assertEquals(2023,this.myLaptop.getYear());
        assertEquals(false,this.myLaptop.isTouchScreen());
    }
    @Test
    public void openTouchScreenSetsIsTouchScreenTrue(){
        this.myLaptop.setTouchScreen(false);
        assertEquals(false, this.myLaptop.getTouchScreen());
        this.myLaptop.openTheScreen();
        assertEquals(true,this.myLaptop.isTouchScreen());
    }
}

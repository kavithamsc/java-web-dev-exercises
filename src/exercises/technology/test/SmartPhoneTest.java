package exercises.technology.test;

import exercises.technology.main.Laptop;
import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SmartPhoneTest {
    private SmartPhone mysmartphone;

    @Before
    public void beforeTest(){

        mysmartphone = new SmartPhone("Dell", "black", 2023,true);
    }

    @Test
    public void constructorSetValuesTest(){
        assertEquals("Dell",this.mysmartphone.getBrand());
        assertEquals("black",this.mysmartphone.getColor());
        assertEquals(2023,this.mysmartphone.getYear());
        assertEquals(true,this.mysmartphone.isConnected5G());
    }
    @Test
    public void openTouchScreenSetsIsTouchScreenTrue(){
        this.mysmartphone.setConnected5G(true);
        assertEquals(true, this.mysmartphone.getConnected5G());
        this.mysmartphone.makePhoneCall("2843949241");
        assertEquals(false,this.mysmartphone.isConnected5G());
    }
}

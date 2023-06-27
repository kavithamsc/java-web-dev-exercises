package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;


import static org.junit.Assert.assertEquals;

public class TestHouseCat {
    @Test
    public void inheritsSuperInFirstConstuctor(){
        HouseCat keyBoardCat = new HouseCat("Keyboard", 7);
        assertEquals(7,keyBoardCat.getWeight(), .001);

    }

}

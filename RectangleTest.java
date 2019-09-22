package edu.gcccd.csis;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
            public void recTest(){
        Rectangle r = new Rectangle(5, 5);
        assertTrue(r.recTest());

        assertEquals(25,25);

    }

}
package edu.gcccd.csis;

import org.junit.Test;

import static org.junit.Assert.*;

@Test
public class CircleTest {
    public void cirTest(){
        Circle c = new Circle(1.0, "blue");
        assertTrue(c.cirTest());
        assertEquals(1.0,1.0);
    }
}
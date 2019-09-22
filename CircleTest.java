package edu.gcccd.csis;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
            public void cirTest(){
        Circle c = new Circle(1.0, "Blue");
        assertTrue(c.CirTest());
    }


}
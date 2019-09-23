package edu.gcccd.csis;

import org.junit.Test;

import static org.junit.Assert.*;

@Test
public class ContainerTest {
    Container cont = new Container();
    Rectangle rec = new Rectangle();
    Circle cir = new Circle("Red");
    cont.setCircle(cir);
    assertTrue(cont.getCircle() == cir);

}
package edu.gcccd.csis;

import static org.junit.Assert.*;
import org.junit.Test;


@Test
public class ContainerTest {
        Container cont = new Container();
        Rectangle rec = new Rectangle();
        Circle cir = new Circle("red");
        cont.setCircle(cir);
        assertTrue(cont.getCircle() == cir);
    }
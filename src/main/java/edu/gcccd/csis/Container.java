package edu.gcccd.csis;

public class Container {
    private Rectangle rectangle;
    private Circle circle;

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public int size(){
        int b = 0;
        if (rectangle == null && circle == null) {
            return b;
        }
        if (rectangle != null || circle != null) {
            return (b = 1);
        }
        if (rectangle != null && rectangle != null) {
            return (b = 2);
        }
        return b;
    }
}
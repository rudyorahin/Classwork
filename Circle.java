package edu.gcccd.csis;

public class Circle {

    private final double radius;
    private String color;
    private static long numOfCircles = 0;
    public Circle (String color){
        this.color = color;
        radius = 1.0;
        numOfCircles ++;
    }
    public Circle ( double radius, String color){
        this.radius = radius;
        this.color = color;
        numOfCircles ++;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area;
        area = Math.PI * radius * radius;
        return area;
    }
    public double getCircumference(){
        double circumference;
        circumference = 2 * Math.PI * radius;
        return circumference;
    }
}

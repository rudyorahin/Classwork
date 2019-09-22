package edu.gcccd.csis;

public class Rectangle {
    private double width;
    private double height;
    private static long numOfRectangles = 0;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
        numOfRectangles ++;
    }
    public Rectangle(){
        this.width = 5;
        this.height = 5;
        numOfRectangles ++;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        double area;
        area = height * width;
        return area;
    }
    public double getCircumference(){
        double circumference;
        circumference = (height + width) * 2;
        return circumference;
    }
    public boolean isSquare(){
        boolean square = width == height;
        return square;
    }
}

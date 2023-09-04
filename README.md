# Java Geometric Shapes

## Description

This Java project contains classes to work with geometric shapes, specifically circles and rectangles. Additionally, there's a `Container` class that can hold one of each shape. 

## Features

- Circle
  - Can get and set color
  - Calculates area and circumference
  
- Rectangle
  - Can get and set width and height
  - Calculates area and circumference
  - Checks if the rectangle is a square
  
- Container
  - Can hold a circle and/or rectangle object
  - Determines the number of shapes it contains

## Setup

To get started, clone the repository to your local machine:

```bash
git clone git@github.com:rudyorahin/Geometric-Shapes---OOP.git
```



Navigate to the src/main/java/edu/gcccd/csis directory to find the source files.

## Usage

### Circle Class
Circle circle = new Circle(5, "Red");  
System.out.println("Color: " + circle.getColor());  
System.out.println("Radius: " + circle.getRadius());  
System.out.println("Area: " + circle.getArea());  
System.out.println("Circumference: " + circle.getCircumference());  

### Rectangle Class
Rectangle rectangle = new Rectangle(5, 5);  
System.out.println("Width: " + rectangle.getWidth());  
System.out.println("Height: " + rectangle.getHeight());  
System.out.println("Area: " + rectangle.getArea());  
System.out.println("Circumference: " + rectangle.getCircumference());  
System.out.println("Is Square: " + rectangle.isSquare());  


### Container Class
Container container = new Container();  
container.setCircle(circle);  
container.setRectangle(rectangle);  
System.out.println("Number of shapes in the container: " + container.size());  


# License

### Copyright © 2023 Rudy Orahin.
Licensed under the MIT License. See LICENSE for more information.

---

Feel free to modify the content to better suit your project. Make sure you also create a `LICENSE` file in your GitHub repository and paste the MIT License text into it, stating you as the copyright holder.








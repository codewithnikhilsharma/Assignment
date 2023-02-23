package com.cognizant.shapes;

//Circle class to calculate area of a circle
class Circle1 {
    public double calculateArea(int radius) {
        return 3.14 * radius * radius;
    }
}

//Square class to calculate area of a square
class Square2 {
    public double calculateArea(int sides) {
        return sides * sides;
    }
}

//Triangle class to calculate area of a triangle
class Triangle3 {
    public double calculateArea(int sides) {
        return 0.433 * sides * sides;
    }
}

// Switch 
public class Switch {
    int numberOfSides;

  //A method named "calculateShapeArea"
    public void calculateShapeArea(int numberOfSides, int sideLength) {
        this.numberOfSides = numberOfSides; // Assigning the value of "numberOfSides" passed as argument to instance variable "numberOfSides"
        double area = 0.0;
        // A switch statement to calculate the area based on the number of sides of the shape passed as argument      
        switch (numberOfSides) {
            case 1: // Case 1: Shape is a circle
                Circle1 circle = new Circle1();
                area = circle.calculateArea(sideLength);
                System.out.println("The Area of the Circle is " + area);
                break;
            case 3:
                Triangle3 triangle = new Triangle3();  // Case 3: Shape is a triangle
                area = triangle.calculateArea(sideLength);
                System.out.println("The Area of the Triangle is " + area);
                break;
            case 4:
                Square2 square = new Square2();  // Case 4: Shape is a square
                area = square.calculateArea(sideLength);
                System.out.println("The Area of the Square is " + area);
                break;
            default: // Default case: No shape present
                System.out.println("No Shapes Present");
                break;
        }
    }

  //The main method of the class "Switch"
    public static void main(String[] args) {
        Switch SwitchObj = new Switch(); 
        SwitchObj.calculateShapeArea(3, 12); // Test Case 1
        SwitchObj.calculateShapeArea(4, 15); // Test Case 2
        SwitchObj.calculateShapeArea(5, 15); // Test Case 3
    }
}


package com.cognizant.shapes;

//Circle class to calculate area of a circle
class Circle {
    public double calculateArea(int radius) {
        return 3.14 * radius * radius;
    }
}

//Square class to calculate area of a square
class Square {
    public double calculateArea(int sides) {
        return sides * sides;
    }
}


//Triangle class to calculate area of a triangle
class Triangle {
    public double calculateArea(int sides) {
        return 0.433 * sides * sides;
    }
}

//Shapes class to calculate the area of a shape based on the number of sides
public class shapes {
    int numberOfSides;

    // Method to calculate and print the area of a shape 
    public void calculateShapeArea(int numberOfSides, int sideLength) {
        this.numberOfSides = numberOfSides;
        double area = 0.0;
        if (numberOfSides == 1) { // If number of sides is 1, calculate the area of a circle
            Circle circle = new Circle();
            area = circle.calculateArea(sideLength);
            System.out.println("The Area of the Circle is " + area);
        } else if (numberOfSides == 3) { // If number of sides is 3, calculate the area of a triangle
            Triangle triangle = new Triangle();
            area = triangle.calculateArea(sideLength);
            System.out.println("The Area of the Triangle is " + area);
        } else if (numberOfSides == 4) { // If number of sides is 4, calculate the area of a square
            Square square = new Square();
            area = square.calculateArea(sideLength);
            System.out.println("The Area of the Square is " + area);
        } else { // If number of sides is not 1, 3, or 4, print "No Shapes Present"
            System.out.println("No Shapes Present");
        }
    }

    // Main method to test the calculateShapeArea method with different inputs
    public static void main(String[] args) {
        shapes shapes = new shapes();
        shapes.calculateShapeArea(3, 12); // Test Case 1
        shapes.calculateShapeArea(4, 15); // Test Case 2
        shapes.calculateShapeArea(5, 15); // Test Case 3
    }
}


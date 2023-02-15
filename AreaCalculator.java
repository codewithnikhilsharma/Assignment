package com.cognizant.shapes;

class Rectangle {
    public void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("The Area of the rectangle is calculated using the formula length * breadth");
    }
}

 class AreaCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(5, 10);
    }
}



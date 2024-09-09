package org.example.interfaces;

public class Main {
    // interfaces
    public static void main(String[] args) {
        // Polymorphism -> many forms
        // Whenever you have a variable of type Shape, the behaviour of its calculateArea method is determined during the program's runtime
        Shape square = new Square(10);
        double squareArea = square.calculateArea();
        System.out.println("squareArea = " + squareArea);

        Shape rectangle = new Rectangle(10, 20);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("rectangleArea = " + rectangleArea);

        // We treated both of them, as shapes, and each one has its own implementation of contract (calculateArea method)
        Shape[] shapes = {square, rectangle};
        double sumOfAreas = ShapeCalculator.sumAreas(shapes);
        System.out.println("sumOfAreas = " + sumOfAreas);

        double sumOfAreas2 = ShapeCalculator.sumAreasOfTwoShapes(square, rectangle);
        System.out.println("sumOfAreas2 = " + sumOfAreas2);
    }
}

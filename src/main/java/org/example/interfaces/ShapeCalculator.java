package org.example.interfaces;

public class ShapeCalculator {
    // Square, Rectangle
    // Rectangle, Square
    public static double sumAreasOfTwoShapes(Shape a, Shape b) {
        // Whenever you have a variable of type Shape, the behaviour of its calculateArea method is determined during the program's runtime
        // Polymorphism, many shapes, or many forms
        return a.calculateArea() + b.calculateArea();
    }

    public static double sumAreas(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculateArea();
        }
        return sum;
    }
}

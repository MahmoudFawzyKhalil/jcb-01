package org.example.interfaces;

public class Square implements Shape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }
}

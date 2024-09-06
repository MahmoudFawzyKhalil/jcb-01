package org.example;

public class Vehicle /*extends Object*/ {
    public static void main(String[] args) {
//        Car car = new Car("yellow");
//        System.out.println("car = " + car);
//        car.makeNoise(); // Engine humming
//
//        BMW bmw = new BMW("blue");
//        bmw.makeNoise();

        Vehicle vehicle = new Vehicle("red");

    }

    public Vehicle() {

    }

    public Vehicle(String color) {
        this.color = color;
    }

    // Private properties are not inherited
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeNoise() {
        System.out.println("Generic noise!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
               "color='" + color + '\'' +
               '}';
    }
}


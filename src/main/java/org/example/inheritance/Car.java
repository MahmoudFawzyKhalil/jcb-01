package org.example.inheritance;

// Car has a (parent, super, base) class of Vehicle
class Car extends Vehicle {

//    public Car(String color) {
//        super(color); // accessing super class' method
//    }

    @Override
    public void makeNoise() {
//        System.out.println("Car engine humming...");
        super.makeNoise();
    }
}

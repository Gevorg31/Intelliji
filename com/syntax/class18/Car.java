package com.syntax.class18;

public class Car {

    private   String make; // fields
    private String model; // fields
    private String color; // fields

    public Car() {

    }

    public Car(String carMake, String carModel, String carColor) {
        model = carModel;
        make = carMake;
        color = carColor;
    // private only access same class
    }

    public Car(String carModel) {
        model = carModel; // it is not allowed two constructors in a class with the same parameters and same type
    }

    void printCarModel() {
        System.out.println("model "+model);
    }
    void printInfo() {
        System.out.println("Make "+make+" Model"+model+" Color "+color);
    }
}

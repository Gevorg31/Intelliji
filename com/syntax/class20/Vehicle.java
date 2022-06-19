package com.syntax.class20;

public class Vehicle {
    int engineHP;
    String make;
    String model;
    String color;
}
class Car extends Vehicle { // is intermedia class
    String steeringType;
    boolean autoPilot;
    int noOfWindow;
}
class BMW extends Car {
    int topSpeed;
    void printInfo() {
        engineHP = 500;
        System.out.println(engineHP);

    }
}

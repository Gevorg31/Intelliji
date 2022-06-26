package com.syntax.class22;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Car(String make, String model,int numberOfDoors,int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    Car(String make, String model,int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    Car(int numberOfDoors,int topSpeed, double price){
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Car(String make, String model,int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0.0;
    }

    String  display() {
        return make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price;
    }

}



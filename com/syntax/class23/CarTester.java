package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Tesla();
        car=new Toyota();//reassigning the value
        car.start(); // we will get overwriting method from tesla
        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla = new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();
        Toyota toyota = new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();

        Car[] cars = {new BMW(), new Tesla(), new Toyota()}; // this code replacing code above with help of polymorphism
        for (Car c:cars) {
            c.start();
            c.stop();
            c.park();
        }
    }
}

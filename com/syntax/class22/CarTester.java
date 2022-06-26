package com.syntax.class22;

public class CarTester {
    public static void main(String[] args) {

            Car car1 = new Car("Toyota","Prius",4,120,30000.0);
            Car car2 = new Car("Toyota","Prius",120,30000.0);
            Car car3 = new Car(4,120,30000.0);
            Car car4 = new Car("Toyota","Prius",4);
            System.out.println(car1.display());
            System.out.println(car2.display());
            System.out.println(car3.display());
            System.out.println(car4.display());
        }
    }



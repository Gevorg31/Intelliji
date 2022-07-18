package com.syntax.class28;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        //Create a class Insurance that will have an attribute as insuranceName and unimplemented
        // behaviour as getQuote and cancelInsurance.
        //Create 3 subclasses Car, Pet, Health.
        //Car class has its own attribute as carModel and Class Pet has petType attribute.
        //Create 3 objects of the subclasses and store them in ArrayList.
        //Using for loop/advanced for loop/ iterator access all methods of the class.



    }
}
abstract class Insurance {
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car {
    String carModel;

}
class Pet {
    String petType;

}
class Health {

}

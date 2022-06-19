package com.syntax.class16;

public class Dog {
    String name;
    String color;

    // Static variable - if we know something will always stay the same as (Static int numOfLegs = 4;) we will save a lot of memory and will store only 1 memory.
    //Static variable we can share/access outside the class
    // Instance variable

    public static void main(String[] args) {
        Dog dog1 = new Dog(); // creating an object of Dog class

        dog1.name = "Tomy";
        dog1.color = "Pink";

        Dog dog2 = new Dog();

        dog2.name = "Fido";
        dog2.color = "Balck";

        Dog dog3 = new Dog();

        dog3.name = "Jaja";
        dog3.color = "White";

        System.out.println(dog1.name+" "+dog1.color);
        System.out.println(dog2.name+" "+dog2.color);
        System.out.println(dog3.name+" "+dog3.color);


    }
}
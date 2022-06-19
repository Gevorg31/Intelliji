package com.syntax.class18;

public class Cow {

    String breed; // instance variable
    String color;
    int age;
    double weight;

    public Cow(String breed, String color, int age, double weight) { // local variable
        // When we have same name variables as local and as instance inside a class
        // always local variables are preferred over instance variables by Java in block of code

      //  breed = breed;- assigned breed to the breed same below and never used instance variables

        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

        // we can use keyword this.breed for instance variables
    }
    String getCowInfo() {
        return "Breed "+breed+" Color "+color+" Age "+age+" Weight "+weight;
    }
}

package com.syntax.class19;

public class DogTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", "Grey");
        cat.printInfo();// cat class doe not have
        //this method but because we are using
        //inheritance we can use the method from the parent class
        Dog dog = new Dog("Doggy","Black" );
        dog.printInfo();
    }
}

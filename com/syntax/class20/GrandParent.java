package com.syntax.class20;

public class GrandParent {
    String name = "Gevorg";
}

class Parent extends GrandParent{
    void printInfo() {
        System.out.println("Name of my father is "+name);
    }
}

class Child extends Parent {
    void printInfo() {
        System.out.println("Name of my Grandpa is "+name);
    }
}

class gGrandChild extends Child {
    void printInfo() {
        System.out.println("My grand grand father name is "+name);
    }

    public static void main(String[] args) {

    }
}
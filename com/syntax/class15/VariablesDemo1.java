package com.syntax.class15;

public class VariablesDemo1 {

    String name; // instance not inside a method

    static int num = 5; // static variable

    void printName() {
        String name = "Local";// local variable inside the method
        System.out.println(name);
    }
    public static void main(String[] args) {
        VariablesDemo1 v = new VariablesDemo1();
        v.printName();
    }

}

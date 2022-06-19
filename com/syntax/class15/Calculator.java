package com.syntax.class15;

public class Calculator {
    void  add (int x, int y) {
        System.out.println(x+y);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(10,20);
    }

}

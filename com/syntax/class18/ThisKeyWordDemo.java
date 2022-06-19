package com.syntax.class18;

public class ThisKeyWordDemo {
    String name = "Instsnce";
    void printName() {
        String name = "Local"; // prefer local without this keyword
        System.out.println(this.name); // instance
        System.out.println(name); // local
    }

    public static void main(String[] args) {
        ThisKeyWordDemo t = new ThisKeyWordDemo();
        t.printName();
    }
}

package com.syntax.class21;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //main.method();
        //main.method(19);
    }


}
class Child extends Main {
    static void method(int x) {
        System.out.println("Child method");
    }
}
class Parent extends Main {
    static void method () {
        System.out.println("Parent method");
    }
}


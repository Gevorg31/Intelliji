package com.syntax.class22;

public class Task2 {
    //Create 1 class with a static method that has 3 overloaded forms.
    //Then call each overloaded method with specific arguments and observe result.

    static void sayHello() {
        System.out.println("Hello Batch 13");
    }

    static void sayHello (String msg) {
        System.out.println(msg);
    }

    static void sayHello (String msg, int times) {
        for (int i=0; i<times; i++) {
            System.out.println(msg);
        }
    }
}

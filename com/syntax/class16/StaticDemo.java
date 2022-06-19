package com.syntax.class16;

public class StaticDemo {

  static   int numOfEmployees = 10;
    String name;

    static void method1() {
        System.out.println(numOfEmployees); // static designed to have only one value
       // System.out.println(name); because each object will be
        // having a separate copy of the same variable
        // Java gets confused which value to print
    }

    void method2() {
        System.out.println(name);
        System.out.println(numOfEmployees);
        String name;
    }

    public static void main(String[] args) {

        StaticDemo st = new StaticDemo();
        st.name = "Omid";

        StaticDemo st2 = new StaticDemo();
        st2.name = "Gevorg";
    }
}

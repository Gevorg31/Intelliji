package com.syntax.class16;

public class AccessModifiersDemo1 {

   private String password = "pass123";
    String SSN = "12345";
    String name = "Gevorg";

    public static void main(String[] args) {

        AccessModifiersDemo1 ac = new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.SSN);
        System.out.println(ac.name);
    }
}

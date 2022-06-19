package com.syntax.class15;

public class Task4 {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed

    void sayHello(String country) {
        String hello;
        switch (country) {
            case "USA":
            hello = "Hello";
            break;
            case "Russia":
            hello = "Privet";
            break;
            case  "France":
            hello = "Bonjour";
            break;
            default:
                hello = "Country not found";

        }
        System.out.println(hello);
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.sayHello("France");
    }
}

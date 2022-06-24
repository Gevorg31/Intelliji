package com.syntax.class22;

public class AdvanceCalc {

   // void sum (int num1, int num2) {
   //     System.out.println(num1+num2);
   // }
//
   // void sum (int num1, int num2, int num3) {
   //     System.out.println(num1+num2+num3);
   // }
//
   // void sum (int num1, int num2, int num3,int num4) {
   //     System.out.println(num1+num2+num3+num4);
   // }

    static void sum (int ... arr) { // ... called var args
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum+=i;
        }
        System.out.println("Sum of num is "+sum);
    }

    public static void main(String[] args) {
        sum(2,2,3,4,10);

        int age = 10;
        String name;
        if (age>18) {
            name = "Time to go work";
        }else {
            name ="enjoy no Work";
        }
        // ternary operator
        System.out.println(name);
        String name2 = age>18?"Time to go work":"Enjoy no Work";
        System.out.println(name2);
    }
}

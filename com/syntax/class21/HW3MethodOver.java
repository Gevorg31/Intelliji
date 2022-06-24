package com.syntax.class21;

public class HW3MethodOver {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    static void studentInfo(String name) {
        System.out.println("Student name is "+name);
    }

    static void studentInfo(String name, String lastName) {
        System.out.println("Student first name "+name+" last name is "+lastName);
    }

    static void studentInfo(String name, String lastName, int age) {
        System.out.println("Student first name "+name+" last name is "+lastName+" age is "+age);
    }

    public static void main(String[] args) {
        HW3MethodOver methodOver = new HW3MethodOver();
        studentInfo("Andrey");
        methodOver.studentInfo("Liana","Syntax");
        HW3MethodOver.studentInfo("Tom", "Husk",22);
    }
}



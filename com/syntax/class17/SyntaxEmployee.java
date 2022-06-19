package com.syntax.class17;

public class SyntaxEmployee {
    //Create a Class called SyntaxEmployee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class SyntaxEmployee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    String empId;
    int salary;
    // whenever we are sure that two objects of a class can have different
    // values for a variable or if we have to share that variable between two or
    // more methods of that class we should always go with instance variables

    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee syntaxEmployee = new SyntaxEmployee();
        syntaxEmployee.empId = "123";
        syntaxEmployee.salary = 200000;

        SyntaxEmployee syntaxEmployee1 = new SyntaxEmployee();
        syntaxEmployee1.empId = "1234";
        syntaxEmployee1.salary = 123452;

        System.out.println(syntaxEmployee.empId);
        System.out.println(syntaxEmployee.salary);
        System.out.println(syntaxEmployee1.empId);
        System.out.println(syntaxEmployee1.salary);
    }
}
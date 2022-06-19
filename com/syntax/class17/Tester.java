package com.syntax.class17;


import com.syntax.class16.Dog;

public class Tester {
    public static void main(String[] args) {
        // if class exist inside the same package they are imported automatically
        Employee employee = new Employee();
        Dog dog = new Dog();
        Employee employee1 = new Employee();
        employee1.name = "Mike";
        // employee.salary = 125000; because it is private
        employee.department = "IT Saver";
    }
}

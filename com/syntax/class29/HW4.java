package com.syntax.class29;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class HW4 {

        //Create a Person class with following private fields: name, lastName, age, salary.
        //Variables should be initialized through constructor.
        //Inside the class also create a method to print user details.
        //In Test Class create a Map that will store key in ascending order.
        // In that map store personId and a Person Object. Print each object details.


    }

    class Person {
        private String name;
        private String lastName;
        private int age;
        private int salary;
        Person(String name, String lastName, int age, int salary) {
            this.name=name;
            this.lastName=lastName;
            this.age=age;
            this.salary=salary;
        }
        public void printInfo() {
            System.out.println("First name "+name+" last name "+lastName+" age "+age+" salary "+salary);
        }
    }
    class Test1 extends Person{
        Test1(String name, String lastName, int age, int salary) {
            super(name, lastName, age, salary);
        }

        public static void main(String[] args) {
            Map<Integer, String> student = new HashMap<>();
            Person person = new Person("George","Smith",25,40000);
            person.printInfo();

        }
    }



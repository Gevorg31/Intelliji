package com.syntax.class17;

public class Task2 {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {

        Task2 task2 = new Task2();
        task2.name = "Gevorg";
        task2.id = "JB123123";
        numberOfStudents = 1;// if we are inside the same class we can access static variables inside static
        // methods by just writing the name of that variable we don't need to create an object
        System.out.println(task2.name);
        System.out.println(task2.id);
        System.out.println(numberOfStudents);

        Task2 task3 = new Task2();
        task3.name = "Gevorg";
        task3.id = "JB123123";

        System.out.println(task3.name);
        System.out.println(task3.id);
        System.out.println(numberOfStudents);
    }
}

package com.syntax.class23;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students = { new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(Student print:students) {
            print.listening();
            print.reading();
            print.writing();
        }
    }
}

package com.syntax.class28;

import java.util.*;

public class HW4StudentType {
    //Create a Set collection that will hold Objects of Student Type.
    // In this set we do not care about the insertion order.
    // Each student object should have name and studentID.
    // Display name of each student.

    public static void main(String[] args) {
        Map<String,Integer> studentType = new LinkedHashMap<>();
        studentType.put("Andrey",3657);
        studentType.put("Gevorg",3659);
        studentType.put("Liana",3658);
        studentType.put("Mumtaz",3566);
        studentType.put("Anastasia",3665);
        studentType.put("Asghar",3333);
        studentType.put("Sofia",3535);
        System.out.println("Students name "+studentType.keySet());

        Set<String> student = studentType.keySet();
        for (String studentName:student) {
            System.out.println("Student name is "+studentName);
        }
    }
}

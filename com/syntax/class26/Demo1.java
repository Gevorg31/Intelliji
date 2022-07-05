package com.syntax.class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name = "Aladin";
        String name2 = "Reza";
        String name3 = "Ahmrd";
        // int size = 10;
        // String [] arr = new String[size];
        String[] names = {"Aladin", "Reza", "C"}; // with help of Array we are not going to create a lot of methods
        names  = new String[4];
        names[0] = "Aladin";
        names[1] = "Reza";
        names[2] = "Ahmed";
        names[3] = "Gevorg";
        System.out.println(names.length);
        // <> - diamond operator
        ArrayList<String> syntaxStudents = new ArrayList<>();
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Riaz");
        System.out.println(syntaxStudents.size());
        syntaxStudents.add("Karla");
        syntaxStudents.add("Karla");
        System.out.println(syntaxStudents.size());

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<10; i=i+2) { // odd num
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}

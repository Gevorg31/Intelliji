package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // we can store the object of the class inside a variable of type parent class
        // interface if that class implements that interface
        List<String> legends = new ArrayList<>();
        legends.add("Hamid");
        legends.add("Gevorg");
        legends.add("Liana");
        legends.add("Mumtaz");
        System.out.println(legends.size());
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Bahram"));
        System.out.println(legends.contains("Hamid"));
        Object[] arr = legends.toArray();
        System.out.println(arr[0]);
        legends.remove("Hamid");
        System.out.println(legends);


        List<String> someStudents = new ArrayList<>();
        someStudents.add("Gevorg");
        someStudents.add("Liana");
        System.out.println(legends.containsAll(someStudents));
    }
}

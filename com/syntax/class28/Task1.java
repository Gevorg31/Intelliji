package com.syntax.class28;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //   Find out whether the given ArrayList is empty or not?
        //   Check whether the specific name is present in an ArrayList or not?
        //    Find the size of your arrayList and print all values from that

        ArrayList<String> names = new ArrayList<>(5); // always good to specify initial capacity
                                                                 // improves the performance
        names.add("Emre");
        names.add("Selda");
        names.add("Jala Khan");
        names.add("Pati Chai");
        names.add("Zameer");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Zameer"));
        System.out.println(names.size());
    }
}

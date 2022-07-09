package com.syntax.class26;

import java.util.ArrayList;

public class HW2ArrayListNames {
    //Create an ArrayList that will store 5 names into it.
    //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?
    //Find the size of your arrayList and print all values from that
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Gevorg");
        names.add("Mumtaz");
        names.add("Liana");
        names.add("Zemeer");
        names.add("Sameer");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Gevorg"));
        System.out.println(names.size());
        System.out.println(names);

        for (String name:names) {
            System.out.println(name);
        }

    }
}

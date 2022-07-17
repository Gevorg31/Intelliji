package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListNames {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that

        ArrayList<String> names = new ArrayList<>();
        names.add("Nana");
        names.add("Tom");
        names.add("Fred");
        names.add("Jerry");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jerry"));

        for(int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}

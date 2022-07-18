package com.syntax.class28;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HW2Countries {
    //Create a Set collection in which you need to add names of the countries.
    // In this set we want all objects to be sorted in alphabetical order.
    // Using 2 different ways retrieve all elements from set.
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Ukraine");
        countries.add("Armenia");
        countries.add("China");
        countries.add("Japan");
        countries.add("Russia");
        countries.add("England");
        countries.add("Vietnam");
        countries.add("Belarus");
        countries.add("Pakistan");
        countries.add("Uzbekistan");
        countries.add("Afghanistan");
        countries.add("Zimbabwe");
        System.out.println(countries);

        LinkedHashSet<String> newCountries = new LinkedHashSet<>();
        newCountries.addAll(countries);
        for (String c: newCountries) {
            System.out.println(c);
        }
    }
}

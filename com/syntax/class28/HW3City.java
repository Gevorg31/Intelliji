package com.syntax.class28;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class HW3City {
    //Create a Set of cities in which you want to make sure that insertion
    // order is maintained. Then remove any city that starts with “A”;
    public static void main(String[] args) {
        TreeSet<String> city = new TreeSet<>();
        city.add("Atlanta");
        city.add("Dallas");
        city.add("Dubai");
        city.add("Mumbai");
        city.add("Antwerp");
        city.add("New York");
        city.add("Geneva");
        city.add("Huston");
        city.add("Miami");
        city.add("Brussels");
        city.add("Abu Dhabi");
        city.add("Jakarta");
        city.add("Athens");
        city.add("Amsterdam");
        System.out.println(city);


        city.removeIf(s -> s.startsWith("A")); // 1st
        System.out.println(city);

        Iterator<String> iterator = city.iterator();// 2nd
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(city);
    }
}

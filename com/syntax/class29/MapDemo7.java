package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",2000.0); // auto upcasting does not work with wrappers
        fruits.put("Orange",20.5);
        fruits.put("Kiwi",10.2);
        fruits.put("Banana",10.2);
        fruits.put("Peach",10.5);

        Set<Map.Entry<String, Double>> entries = fruits.entrySet();
        //if key contains letter e and if its price greater than 10.2
        entries.removeIf(entry->entry.getKey().contains("e") && entry.getValue()>10.2);
        System.out.println(fruits);

    }
}

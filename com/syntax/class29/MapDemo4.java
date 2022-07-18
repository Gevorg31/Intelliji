package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",2000.0); // auto upcasting does not work with wrappers
        fruits.put("Orange",20.5);
        fruits.put("Kiwi",10.2);
        fruits.put("Banana",50.5);
        fruits.put("Peach",10.5);
        Set<Map.Entry<String,Double>> entries = fruits.entrySet();
        for (Map.Entry<String,Double>entry:entries) {
            System.out.println("Entry = "+entry);
        }
    }
}

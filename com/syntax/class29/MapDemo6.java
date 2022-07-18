package com.syntax.class29;

import java.sql.Connection;
import java.util.Collection;
import java.util.HashMap;

public class MapDemo6 {
    public static void main(String[] args) {
        // how can we remove the elements from a map bases on the value
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",2000.0); // auto upcasting does not work with wrappers
        fruits.put("Orange",20.5);
        fruits.put("Kiwi",10.2);
        fruits.put("Banana",10.2);
        fruits.put("Peach",10.5);

        Collection<Double> values = fruits.values();
        values.removeIf(value->value>10.2);
        System.out.println(fruits);
    }
}

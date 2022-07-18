package com.syntax.class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",2000.0); // auto uocasting does not work with wrappers
        fruits.put("Orange",20.5);
        fruits.put("Kiwi",10.2);
        fruits.put("Banana",50.5);
        fruits.put("Peach",10.5);
        Set<String> keys = fruits.keySet();// will return us all the keys from a map in the form of Set
        for (String key:keys) {
            System.out.println("Keys = "+key);
        }
        // All the calues in the form of a collection
        Collection<Double> values = fruits.values();
        for (Double value:values) {
            System.out.println("Values "+value);
        }
    }
}

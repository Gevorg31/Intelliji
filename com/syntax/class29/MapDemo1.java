package com.syntax.class29;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",2000.0); // auto uocasting does not work with wrappers
        fruits.put("Orange",20.5);
        fruits.put("Kiwi",10.2);
        fruits.put("Banana",50.5);
        fruits.put("Apple",10.5);
        System.out.println(fruits);
        System.out.println(fruits.get("Kiwi"));
        System.out.println(fruits.remove("Orange"));
        System.out.println(fruits);
        System.out.println(fruits.containsKey("Kiwi"));
        System.out.println(fruits.containsValue(10.2));
        System.out.println(fruits.isEmpty());
        fruits.replace("Kiwi",15.2);
        System.out.println(fruits);
        fruits.put(null,null);
    }

}

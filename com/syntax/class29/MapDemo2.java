package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> fruits = new TreeMap<>();
        fruits.put("Apple",20);
        fruits.put("Water Melon",25);
        fruits.put("Peach",20);
        fruits.put("Strawberry",100);

        HashMap<String, Integer> cosmetics = new HashMap<>();
        cosmetics.put("Foundation",20);
        cosmetics.put("Lipstick",25);
        cosmetics.put("Mascara",20);
        cosmetics.put("Blush",100);


        LinkedHashMap<String, Integer> groceries = new LinkedHashMap<>();
        groceries.putAll(fruits);
        groceries.putAll(cosmetics);
        System.out.println(groceries);
    }
}

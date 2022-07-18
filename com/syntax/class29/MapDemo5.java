package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
    HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("Apple",2000.0); // auto upcasting does not work with wrappers
        fruits.put("Orange",20.5);
        fruits.put("Kiwi",10.2);
        fruits.put("Banana",50.5);
        fruits.put("Peach",10.5);
        // to change the size we need to have Iterator
        Set<String> keys = fruits.keySet();
       /* for (String key:keys) {
            if (key.contains("e")) {
                fruits.remove(key);
            }
        }*/

        keys.removeIf(s -> s.contains("e")); //Lambda operator we can use this one instead of code below


        Iterator<String> iterator = keys.iterator();// with Iterator we are using while loop
        while (iterator.hasNext()) {
            if (iterator.next().contains("e")) {
                iterator.remove();
            }
        }
        System.out.println(fruits);
    }
}

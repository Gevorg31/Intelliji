package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {


        HashMap<String, Integer> items = new HashMap<>();
        items.put("mango", 10);
        items.put("apple", 30);
        items.put("orange", 20);
        items.put("mango", 40);
        items.put("mango", 40);

        Iterator<Map.Entry<String,Integer>> iterator = items.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String,Integer> item = iterator.next();
                System.out.println("Key = "+item.getKey()+" and value = "+item.getValue());
            }
    }
}

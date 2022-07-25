package com.syntax.class30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<String,String> objects = new LinkedHashMap<>();
        objects.put("1 item","apple");
        objects.put("2 item","banana");
        objects.put("3 item","pear");
        objects.put("4 item","tomato");
        objects.put("5 item","mango");
        objects.put("6 item","kiwi");

        Set<Map.Entry<String, String>> keys = objects.entrySet();
        for(Map.Entry<String, String> key:keys) {
            System.out.println("Key is "+key.getKey()+" and value is"+key.getValue());
        }
    }
}

package com.syntax.class30;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Test7 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        Display(map);
        map.clear();
        Display(map);
    }
        static void Display (Map<String,Integer> map){
            if(map.isEmpty()) {
                System.out.println("map is empty");
            }else {
                Iterator<Map.Entry<String, Integer>> fruits = map.entrySet().iterator();
               while (fruits.hasNext()) {
                   Map.Entry<String, Integer> fruit = fruits.next();
                   System.out.println(fruit.getKey()+" : "+fruit.getValue());
               }
            }
        }
    }


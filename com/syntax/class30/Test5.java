package com.syntax.class30;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Remove");

        for (Map.Entry<String, String> letter:map.entrySet()) {
            System.out.println(letter.getKey()+" : "+letter.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Remove");

       // Iterator<Map.Entry<String,String>> letter1 = letters.entrySet().iterator();
        // while (letter1.hasNext()) {
            // Map.Entry<String,String> removeLetter = letter1.next();

             //if(removeLetter.getKey().startsWith("O")|| removeLetter.getKey().startsWith("F")) {
                // letter1.remove();
        map.entrySet().removeIf(n ->n.getKey().contains("ONE") || n.getKey().contains("FOUR"));

                 for (Map.Entry<String,String> letter2 : map.entrySet()) {
                    System.out.println(letter2.getKey()+" : "+letter2.getValue());
                }
             }
         }
   //   }
 //}

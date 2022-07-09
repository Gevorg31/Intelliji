package com.syntax.class26;

import java.util.ArrayList;

public class HW3ArrayListRemove {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Syntax");
        words.add("Element");
        words.add("Umbrella");
        words.add("Tea");
        words.add("Cars");
        words.add("Coffee");
        words.add("Aladdin");

        for (int i=0; i<words.size(); i++) {
            if(words.get(i).endsWith("e")) {
                words.remove(i);
            }
        }
        System.out.println(words);

    }
}

package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> words = new ArrayList<>();

        words.add("Gevorg");
        words.add("Hello");
        words.add("Space");
        words.add("World");
        words.add("White");

        for (int i=0; i<words.size(); i++) {
            if (words.get(i).endsWith("e")) {
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}

package com.syntax.class26;

import java.util.ArrayList;

public class HW4ArrayListDrink {
    //Create an arrayList of drinks.
    // If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Vodka Shot");
        drinks.add("Mojito");
        drinks.add("Black Russian");
        drinks.add("Bloody Merry");
        drinks.add("Margarita");


        for (int i=0; i<drinks.size(); i++) {
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add("Water");
            }
        }
        System.out.println(drinks);
    }
}

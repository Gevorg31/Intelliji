package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDrinks {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Wine");
        drinks.add("Pepsi");
        drinks.add("Soda");
        drinks.add("Milk");
        drinks.add("Coca-Cola");


        for(int i=0; i<drinks.size(); i++) {
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add(i,"Water");
            }
        }

        System.out.println(drinks);
    }
}

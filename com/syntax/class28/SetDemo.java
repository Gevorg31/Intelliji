package com.syntax.class28;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Mango");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        // Set not allowed duplicates and order is not maintained, random
        System.out.println(fruit);
    }
}

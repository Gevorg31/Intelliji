package com.syntax.class28;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        System.out.println(fruit);
    }
}

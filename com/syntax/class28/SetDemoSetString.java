package com.syntax.class28;

import java.util.TreeSet;

public class SetDemoSetString {
    public static void main(String[] args) {
        TreeSet<String> letters = new TreeSet<>();
        letters.add("z");
        letters.add("a");
        letters.add("v");
        letters.add("c");
        System.out.println(letters);
        // priority is given to first letter then second etc

    }
}

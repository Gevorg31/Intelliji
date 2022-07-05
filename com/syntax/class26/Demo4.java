package com.syntax.class26;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Zameer");
        names.add("Gevorg");
        names.add("Kelvin");
        names.add("Liana");
        System.out.println(names);
        names.remove("Kelvin");
        System.out.println(names);
    }
}

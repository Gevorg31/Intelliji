package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;



public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            names.add(0, "Capitan Naveed");

        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
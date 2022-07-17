package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    public static void main(String[] args) {
       List<Integer> names = new ArrayList<>();
       for(int i=50; i<100; i++) {
           if (i%3==0) {
               names.add(i);
           }
       }
        System.out.println(names);
    }
}

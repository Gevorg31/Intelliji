package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class HW1Duplicates {
    //How can you remove all duplicates from ArrayList?
    //List<String> aList=new ArrayList<>();
    //aList.add("John");
    //aList.add("Jane");
    //aList.add("James");
    //aList.add("Jasmine");
    //aList.add("Jane");
    //aList.add("James");
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        LinkedHashSet<String> newList = new LinkedHashSet<>();
        newList.addAll(aList);
        System.out.println(newList);


    }
}

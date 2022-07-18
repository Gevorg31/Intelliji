package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);

        // when we pass the list to the constructor of the Set and Java will create
        // a set out of that list using the same approach we get a list back from the set
        numbers = new ArrayList<>(new LinkedHashSet<>(numbers));// this option is faster and recommended

        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>();// creating a set
        linkedHashSet.addAll(numbers); // adding all the elements from the list to set
        numbers=new ArrayList<>();// create a new array or clear array
        numbers.addAll(linkedHashSet);// adding unique element

        System.out.println(numbers);
    }
}

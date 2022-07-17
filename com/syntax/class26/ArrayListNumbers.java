package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListNumbers {
    public static void main(String[] args) {
        //Create an arrayList of even numbers from 1 to 500.
        // Remove any number that is divisible by 5 from that arrayList.

    ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i=1; i<500; i++) {
            if(i%2==0) {
                evenNumbers.add(i);
            }
        }
        for (int i=1; i<evenNumbers.size(); i++) {
            if(evenNumbers.size()%5==0) {
                evenNumbers.remove(i);
            }
        }
        System.out.println(evenNumbers);
    }
}

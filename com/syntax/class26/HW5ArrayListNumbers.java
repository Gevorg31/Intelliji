package com.syntax.class26;

import java.util.ArrayList;

public class HW5ArrayListNumbers {
    //Create an arrayList of even numbers from 1 to 500.
    // Remove any number that is divisible by 5 from that arrayList.
    public static void main(String[] args) {

        ArrayList<Integer> evenNum = new ArrayList<>();

        for(int i=1; i<500; i++) {
            if(i%2==0) {
                evenNum.add(i);
            }
        }

        for (int i=1; i<evenNum.size(); i++) {
            if(evenNum.get(i)%5==0) {
                evenNum.remove(i);
            }
        }

        System.out.println("Even Number : "+evenNum);
    }
}

package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    /*
Create a collection of integers in which you can keep duplicates.
  Write a logic to find sum of all integers
 */
    public static void main(String[] args) {
        // we can store duplicates in ArrayList or LinkedList

        List<Integer> number =  Arrays.asList(10,20,30,40);
             int sum=0;
        for(Integer num:number) {
            sum+=num;
        }
        System.out.println(sum);
    }
}

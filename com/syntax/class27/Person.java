package com.syntax.class27;


import java.util.Scanner;
import java.util.ArrayList;


public class Person {
    // Using Scanner class add 5 elements into ArrayList and then
    // print all elements from that ArrayList all in 1 line
    // 4 62 8 5 4

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();


        for (int i=0; i<5; i++) {
            Scanner scanner = new Scanner(System.in);
            num.add(scanner.nextInt());
        }
        String str = num.toString().replaceAll("\\[|\\]", "").replaceAll(", "," ");
        System.out.println(str);
    }
}


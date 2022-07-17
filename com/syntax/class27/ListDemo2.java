package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {


        ArrayList<String> legends = new ArrayList<>(); // recommended
        legends.add("Hamid");
        legends.add("Gevorg");
        legends.add("Liana");
        legends.add("Mumtaz");
        ArrayList<String> moreStudents = new ArrayList<>();
        moreStudents.add("Jason");
        moreStudents.add("Handan");

        ArrayList<String> allStudents= new ArrayList<>();
        allStudents.addAll(legends);
        System.out.println(allStudents);
        allStudents.addAll(moreStudents);
        System.out.println(allStudents);
        allStudents.removeAll(moreStudents);// opposite to addAll method
        System.out.println(allStudents);
        allStudents.clear();
        System.out.println(allStudents);
    }
}
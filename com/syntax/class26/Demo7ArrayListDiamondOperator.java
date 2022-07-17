package com.syntax.class26;

import java.util.ArrayList;

public class Demo7ArrayListDiamondOperator {
    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add(1,"Jira");// overloading
        System.out.println(subject.indexOf("Java")); // current index of Java
        System.out.println(subject.size()); // total num of elements in ArrayList
        subject.remove("Git");
        System.out.println("subject = " + subject); //soutv to printout array or arrayList
        System.out.println(subject.contains("Selenium"));
        subject.get(0);// will return the actual element
        System.out.println("subjects.get(0) = "+subject.get(0));
        subject.clear();


    }
}

package com.syntax.class27;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {

        ArrayList<String> legends = new ArrayList<>(); // recommended
        legends.add("Hamid");
        legends.add("Gevorg");
        legends.add("Liana");
        legends.add("Mumtaz");
        legends.add("Yusuf");
        legends.add("Adfgh");
        legends.add("Tara");
        legends.add("Yusuf");
        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);
        legends.set(0,"Hamid Jan");
        System.out.println(legends);
        System.out.println(legends.indexOf("Yusuf"));
        System.out.println(legends.lastIndexOf("Yusuf"));
        System.out.println(legends.subList(0,3)); // smaller list of arraylist from 0 to 3
        System.out.println();
    }
}

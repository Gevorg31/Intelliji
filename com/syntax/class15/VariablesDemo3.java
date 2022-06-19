package com.syntax.class15;

public class VariablesDemo3 {
    static int num = 5;
    String name;

    public static void main(String[] args) {
        VariablesDemo3 v1 = new VariablesDemo3();
        v1.name = "Naveed";
        VariablesDemo3 v2 = new VariablesDemo3();
        v2.name = "Gevorg";
        VariablesDemo3 v3 = new VariablesDemo3();
        v3.name = "Mumtaz";
        System.out.println(v1.num);
    }
}

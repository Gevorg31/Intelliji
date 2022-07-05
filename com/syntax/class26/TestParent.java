package com.syntax.class26;

abstract class TestParent {
    void m1() {
        System.out.println("m1 without parameters");
    }
    void m1(int num) {
        System.out.println("m1 method with parameter");
    }
}
class Print extends TestParent {
    public static void main(String[] args) {
        Print print = new Print();
        print.m1();
        print.m1(1);
    }
}

package com.syntax.class26;

public class TESTER {
    public static void main(String[] args) {
        TESTER main = new TESTER();
        Child childObject = new Child();
        childObject.publicMethod();
        childObject.protectedMethod();
        childObject.defaultMethod();
    }
}
class Parent {
    public void publicMethod() {
        System.out.println("I am parent public method");
    }
    protected void protectedMethod() {
        System.out.println("I am a parent protected method");
    }
    void defaultMethod() {
        System.out.println("I am a parent default method");
    }
    private void privateMethod() {
        System.out.println("I am a parent private method");
    }
}
class Child extends Parent {
    public void publicMethod() {
        System.out.println("I am a child public method");
    }
    protected void protectedMethod() {
        System.out.println("I am a child protected method");
    }
    void defaultMethod() {
        System.out.println("I am a child default method");
    }
}

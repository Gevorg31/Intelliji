package com.syntax.class19;

public class SDET extends Human {
    boolean goodWithJava;
    SDET(String name, String eyeColor, String job, int age,boolean goodWithJava) {
        this.name = name; // coming from parents need to use extends Human
        this.eyeColor = eyeColor;
        this.job = job;
        this.age = age;
        this.goodWithJava=goodWithJava;
    }
    void printInfo() {
        System.out.println("My name is "+name+" i do "+job+" am i good with Java "+goodWithJava);
    }

    public static void main(String[] args) {
        SDET sdet = new SDET("Sameer", "Black", "GYM",22, true);
        sdet.printInfo();
    }
}

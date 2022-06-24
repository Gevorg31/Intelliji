package com.syntax.class21;

public class HW1Calculate {
    //Create 1 class in which create a methods that
    // will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    void area(float x) {
        System.out.println("The area of a square is: " + x * x);
    }
    void area(float x, float y) {
        System.out.println("The area of a rectangle is: " + x * y);
    }
    void area(double x, double y, double z) {
        System.out.println("The volume of a box is: " + x * y * z);
    }
}
class Overload {
    public static void main(String[] args) {
        HW1Calculate calculate = new HW1Calculate();
        calculate.area(5);
        calculate.area(5, 10);
        calculate.area(10, 10, 5);
    }
}

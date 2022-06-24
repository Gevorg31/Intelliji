package com.syntax.class21;

public class Task2 {

    //Write program: Shape class has a constructor that takes the radius and has a subclass as
    // circle class. In circle class create a method to calculate the area of circle. Test your code
}

class Shape{
    double radius;
    Shape(double radius){
        this.radius=radius; //using this because we have same in local and instance
    }
}

class Circle extends Shape{

    Circle(double radius) {
        super(radius);
    }
    void calculateAndPrintArea(){
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("Area "+area);
    }
}
class Tester{

    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.calculateAndPrintArea();
    }
}
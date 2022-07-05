package com.syntax.class26;

public interface Task1Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    // Test your code.
    void calculateArea();
    void calculatePerimeter();


}
class Circle implements Task1Shape {
    int radios = 5;
    @Override
    public void calculateArea() {
        System.out.println("The area of Circle is "+(Math.PI* radios * radios));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of Circle is "+(Math.PI*radios));
    }
}
class Square implements Task1Shape {
    double length = 11.5;
    double width = 11.5;
    @Override
    public void calculateArea() {
        System.out.println("The area of Square is "+length*width);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of Square is "+(width+length+width+length));
    }
}
class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();
        Square square = new Square();
        square.calculateArea();
        square.calculatePerimeter();
    }
}


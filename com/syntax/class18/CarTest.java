package com.syntax.class18;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Audi","etron GT", "Black");
        car.printInfo();
        Car car1 = new Car("BMW","520i","Red");
        car1.printInfo();
        Car car2 = new Car("BMW","520i","Red");
        car2.printInfo();

        Car car3 = new Car("Tesla");
        car3.printCarModel();
    }
}

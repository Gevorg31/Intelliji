package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListCars {
    public static void main(String[] args) {
        //Create an arraylist of cars and retrieve all the values using 3 different ways.

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ferrari");
        cars.add("Honda");

        System.out.println(cars);

        for (int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));;
        }

        for (String car:cars) {
            System.out.println(car);
        }
    }
}

package com.syntax.class26;

import java.util.ArrayList;

public class HW1ArrayListCars {

    //Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Acura");

        System.out.println(cars);

        for(int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for(String car:cars) {
            System.out.println(car);
        }

    }
}

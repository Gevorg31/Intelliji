package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        //Create an arrayList of cars and retrieve all the values using 3 different ways
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Togg");
        cars.add("BMW X5");
        cars.add("Audi S5");
        cars.add("Toyota Camry");
        for (String car:cars) {
            System.out.println(car);
        }
        System.out.println("---------------------------------");
       for (int i=0; i<cars.size(); i++) {
           System.out.println(cars.get(i));
       }
        System.out.println("---------------------------------");
       Iterator<String> iterator = cars.iterator();
       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }
    }
}

package com.syntax.class29;

import java.util.*;

public class HW2 {
    //Create a map of countries with its capital that will store countries in alphabetical order.
    //Print all keys and values from a country map using for each loop and iterator.
    //Print all values from a country map using for each loop and iterator.
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Russia", "Moscow");
        countries.put("Armenia", "Yerevan");
        countries.put("Ukraine", "Kiev");
        countries.put("Italy", "Rome");

        Set<String> country = countries.keySet();
        for (String c : country) {
            System.out.println(c + " " + countries.get(c));
        }
        System.out.println();

        Iterator<String> iterator = country.iterator();
        while (iterator.hasNext()) {
            String c = iterator.next();
            System.out.println(c + " " + countries.get(c));
        }
        System.out.println();

        Collection<String> countryValue = countries.values();
        for (String countryV : countryValue) {
            System.out.println(countryV);
        }
        System.out.println();

        Iterator<String> countryVal = countryValue.iterator();
        while (countryVal.hasNext()) {
            String val = countryVal.next();
            System.out.println(val);
        }
    }
}

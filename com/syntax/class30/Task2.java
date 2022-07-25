package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        TreeMap<String, String> countriesCapitalMap = new TreeMap<>();
        countriesCapitalMap.put("Turkiye","Ankara");
        countriesCapitalMap.put("Azerbaijan","Baku");
        countriesCapitalMap.put("Pakistan","Islamabad");
        countriesCapitalMap.put("Kazakhstan","Astana");

        // countriesCapitalMap.entrySet()) will return a set of Entry object.
        // Entry object has a method get key to get the key and another method to get the value
        for (Map.Entry<String, String> entry : countriesCapitalMap.entrySet()) { // entry is a key value of string and can store key adn value
            System.out.println("Entry key = "+entry.getKey()+" entry value = "+entry.getValue());
        }
        // using method chaining
        // countriesCapitalMap.entrySet() a set of Entry object.
        // entrySet().iterator(); once we have the set we can get an Iterator on that set
       Iterator<Map.Entry<String, String>> iterator = countriesCapitalMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("entry.getKey() = "+entry.getKey()+" value = "+entry.getValue());
        }
        Collection<String> values =  countriesCapitalMap.values();
        for (String country:values) {
            System.out.println("Country = "+country);
        }
        Iterator<String> iterator1 = countriesCapitalMap.values().iterator();
        while (iterator1.hasNext()) {
            System.out.println("Capitals = "+iterator1.next());
        }

    }
}

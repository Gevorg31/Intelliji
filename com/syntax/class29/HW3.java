package com.syntax.class29;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HW3 {
    public static void main(String[] args) {
        //Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.

        Map<Integer,String> items = new HashMap<>();
        items.put(7664847,"Printer");
        items.put(7879885,"TV");
        items.put(7664848,"Phone");
        items.put(7664849,"Laptop");
        items.put(7664845,"Keyboard");
        items.put(7664843,"Monitor");

        Iterator<Map.Entry<Integer,String>> keysAndValues = items.entrySet().iterator();
        while (keysAndValues.hasNext()) {
            Map.Entry<Integer,String> keysValue = keysAndValues.next();
            System.out.println(keysValue.getKey()+"="+keysValue.getValue());
        }

    }
}

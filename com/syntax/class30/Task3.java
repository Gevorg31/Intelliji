package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {

        HashMap<Integer, String> bestBuyMap = new HashMap<>();
        bestBuyMap.put(7664847, "Printer");
        bestBuyMap.put(123456, "iPhone");
        bestBuyMap.put(7879885, "TV");
        bestBuyMap.put(7664855, "Refrigerator");
        bestBuyMap.put(1234567, "iPad");

        bestBuyMap.entrySet();
        for (Map.Entry<Integer,String> entry:bestBuyMap.entrySet()) {
            System.out.println(entry);
        }

    }
}

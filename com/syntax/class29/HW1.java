package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HW1 {
    //Create a map of a building. Store floor number and it is associated company name.
    // (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    //Check how many entries you have?
    //Update company on a 4th floor
    //Remove company on the 7th floor
    //Print your map

    public static void main(String[] args) {
        Map<Integer,String> companyFloors = new HashMap<>();
        companyFloors.put(1,"Google");
        companyFloors.put(2,"Syntax");
        companyFloors.put(3,"Amazon");
        companyFloors.put(3,"Google");
        companyFloors.put(5,"Brinks");
        companyFloors.put(6,"iBuyPower");
        companyFloors.put(6,"Syntax");

        System.out.println(companyFloors.entrySet());

        Iterator<Map.Entry<Integer, String>> iterator = companyFloors.entrySet().iterator();

        }

    }


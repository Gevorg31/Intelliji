package com.syntax.class29;

import java.sql.Connection;
import java.util.*;

public class HW5 {
    //Create a Map that will store Employee name and salary. Write a logic to retrieve
    // an employee who gets the highest salary. Output should be in the below format
    //John Smith=$100000
    public static void main(String[] args) {

        Map<String, Integer> info = new HashMap<>();
        info.put("John Smith",100000);
        info.put("John Snow",50000);
        info.put("Albert Rust",77000);
        info.put("Edvin Flow",69000);
        info.put("Elisa Dream",89000);

        Collection<Integer> highestSalary = info.values();
            for (Integer salary:highestSalary) {
                if (salary>=100000) {

                }
                }


            }

        }



package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, String> fullAddress = new HashMap<>();
        fullAddress.put("Street","Patrick ST");
        fullAddress.put("Suite","265");
        fullAddress.put("City","Vienna");
        fullAddress.put("Zip","22180");
        fullAddress.put("Country","United State");

        for(Map.Entry<String,String> address : fullAddress.entrySet()) {
            System.out.println(address.getValue().toUpperCase());
        }
    }
}

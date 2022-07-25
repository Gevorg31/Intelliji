package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Test3 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> fullAddress = new LinkedHashMap<>();
        fullAddress.put("Street","Patrick ST");
        fullAddress.put("Suite","265");
        fullAddress.put("City","Vienna");
        fullAddress.put("Zip","22180");
        fullAddress.put("Country","United State");

        Iterator<String> address = fullAddress.values().iterator();
        while (address.hasNext()) {
            System.out.println(address.next());
        }
    }
}

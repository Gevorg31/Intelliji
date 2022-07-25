package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        Iterator<Map.Entry<String, String>> newIterator = map.entrySet().iterator();
        System.out.println("HashMap Before Replace :");
        while (newIterator.hasNext()) {
            Map.Entry<String, String> newMap = newIterator.next();
            System.out.println(newMap.getKey()+" : "+newMap.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");


      //  System.out.println(map);

      //  System.out.println(map);
       Iterator<Map.Entry<String, String>> newIterator1 = map.entrySet().iterator();
        while (newIterator1.hasNext()) {
            Map.Entry<String, String> rpl = newIterator1.next();
            map.replace("THREE","CCC","ASEL");
            map.replace("FIVE","EEE","SUMAIL");
            System.out.println(rpl.getKey()+" : "+rpl.getValue());
        }



       //  Set<Map.Entry<String, String>> mapReplace = map.entrySet();
      //  for (Map.Entry<String, String> mapRepl : mapReplace) {
       //     System.out.println(mapRepl.getKey()+" : "+mapRepl.getValue());
      //  }
        //for (Map.Entry<String, String> mapReplace:map.entrySet()) {
            //if (mapReplace.getKey().contains("THREE") && mapReplace.getValue().contains("CCC")) {
              // System.out.println(mapReplace.setValue("ASEL"));
           // } else if (mapReplace.getValue().contains()) {
           //     System.out.println();
           }
        }

   // }
//}

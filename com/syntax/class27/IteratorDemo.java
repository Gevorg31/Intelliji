package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jenifer");
        names.add("George");
        names.add("Gisel");
        names.add("Abdul");
        names.add("Cindy");
        names.add("Bro");

       // those operations which can change the size of collection are not allowed to be used
      //  for (String name:names) {
        //    if (name.contains("B")) {
          //      names.remove(name);
            //}
        //}
        //System.out.println(names);

        Iterator<String> iterator = names.iterator(); // interface 3 method inside
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

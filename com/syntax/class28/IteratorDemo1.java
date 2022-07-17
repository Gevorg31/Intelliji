package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("Game");

        // Never use any kind of loop when we are planing to use any method that can change the size of a list

       // for(String word:words) {
         //   if(word.endsWith("e")) {
           //     words.remove(word);

            //}
       // }
      // for (int i=0; i<words.size(); i++) {
         //  if(words.get(i).endsWith("e")) {
          //     words.remove(i);
         //  }
     //  }
     //   System.out.println(words);

        Iterator<String> iterator = words.iterator();
       /* System.out.println(iterator.hasNext()); // true or false
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        */
        while (iterator.hasNext()) {
            if (iterator.next().endsWith("e")) {
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}

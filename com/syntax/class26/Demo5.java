package com.syntax.class26;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        System.out.println(subjects.indexOf("Get"));
    }
}

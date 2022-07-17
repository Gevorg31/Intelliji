package com.syntax.class27;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        //names.add(10); error can only insert Strings

        ArrayList all= new ArrayList();  //never use this way its bad , not logically connected
        all.add(10);
        all.add("Name");
        all.add(10.5);

    }
    }


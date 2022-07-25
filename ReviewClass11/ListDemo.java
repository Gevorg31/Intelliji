package ReviewClass11;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zameer");
        names.add("Kat");
        names.add("Urzalla");
        names.add("Selyman");

        for (String name:names) {
            System.out.println("Name = "+name);
        }

        Collections.sort(names);
        System.out.println(names);
    }
}

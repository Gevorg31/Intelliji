package ReviewClass11;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5,5,5,5);
        System.out.println(arrayList);
        System.out.println(Collections.frequency(arrayList,5));
    }
}

package oct.oct1.AL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL001 {
    public static void main(String[] args) {
        // Immutable List - Constant List
        List list = List.of("A","B");

        List list2 = new ArrayList();
        // Dynamic Dispatch
        // Father can have ref to Child Class



        ArrayList list1 = new ArrayList();
        // Mutable and Dyanmic Size

        list1.add("Prmaod");
        list1.add("Dutta");
        list1.add("Dutta");
//        list1.add(123);
//        list1.add(null);
        System.out.println(list1);

        System.out.println(list1.size());

        System.out.println(list.isEmpty());

//        list1.remove(1);
        System.out.println(list1);

        // Sort
        Collections.sort(list1);
        System.out.println(list1);










    }
}

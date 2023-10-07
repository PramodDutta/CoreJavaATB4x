package oct.oct7.setdemo;

import java.util.HashSet;
import java.util.Set;

public class Set002 {
    public static void main(String[] args) {
        Set hs = new HashSet();

        // ArrayList - Dynamic Array
        // LinkedInList -> Doubly LinkedList Nodes
        // Vector - Dynamic Array Thread Safe
        // Stack - LIFO (Expand)



        // HashSet - mean? How they are storing the values in HastSet
        // Hastable - ??
        HashSet hs2 = new HashSet();
        hs2.add("Pramod");
        hs2.add(23);
        hs2.add(109);
        hs2.add("Dutta");
        System.out.println(hs2);


        System.out.println(hs2.size());
        System.out.println(hs2.remove(23));
        System.out.println(hs2);
        hs2.clear();
        System.out.println(hs2);


    }
}

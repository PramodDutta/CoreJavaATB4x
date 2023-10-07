package oct.oct7.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set004 {
    public static void main(String[] args) {
        Set hs = new HashSet(); // Hastset store the elements ?
        // Hashtable -> ? No Order
        hs.add(null);
        System.out.println(hs);



        Set lhs = new LinkedHashSet();
        // Doubly - LinkedIn List
        lhs.add("pramod");
        lhs.add("dutta");
        lhs.add("lucky");
        lhs.add(null);
        System.out.println(lhs);


        Set treeset = new TreeSet();
        treeset.add("pramod");
        treeset.add("aramod");
        treeset.add("amod");
        treeset.add(123);
//        treeset.add(null);
        System.out.println(treeset);
        // Tree Set ??
        // Red and Black Tree


        // List of elemnts in Page
        // We store without any order -> HashSET there no duplicate
        /// maintain order -> LinkedHastSet
        // Sort them by Alpha - TreeSet

        // Duplicate also
        // ArrayList
        //






    }
}

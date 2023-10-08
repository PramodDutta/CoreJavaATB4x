package oct.oct8.map;

import java.util.*;

public class Map006 {
    public static void main(String[] args) {
        //Map m = new TreeMap<>();
       // Map m = new LinkedHashMap();
        Map m = new HashMap();
        m.put("name","pramod");
        m.put("age",34);
        m.put(null,34);
        m.put(234,34);
        System.out.println(m);


        Hashtable<Integer,String> ht = new Hashtable<>();
        // Syn - Thread safe -
        ht.put(1,"pramod");
//        ht.put(null,"pramod");
        ht.put(2,"ramod");
        System.out.println(ht);


        // Hashing -

    }
}

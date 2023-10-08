package oct.oct8.map;

import java.util.*;

public class Map03 {
    public static void main(String[] args) {
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(1,"Pramod");
        studentMap.put(2,"ramod");
        studentMap.put(3,"amod");
        studentMap.put(4,"mod");
        studentMap.put(5,"od");
        studentMap.put(6,"d");
        System.out.println(studentMap);

//        Collection c = null;
//        Collections.sort();


        //studentMap.put("name","pramd");
        studentMap.put(-1,"Ataa");

        studentMap.put(null,"Ataa");
        studentMap.put(null,"dutta");
        System.out.println(studentMap);


        // get

        System.out.println(studentMap.get(2));

        Set a = studentMap.entrySet();
        System.out.println(a);


        //  Get all the values
        // EnrtySet()


        for(Map.Entry<Integer,String> e: studentMap.entrySet()){
            System.out.println(e.getKey() + " --> "+ e.getValue());
        }









    }
}

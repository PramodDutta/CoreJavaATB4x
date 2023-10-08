package oct.oct8.map;

import java.util.HashMap;

public class Map05 {
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes"); //trying duplicate key

        System.out.println(map);
        map.remove(1);
        System.out.println(map);
        map.remove(103);




        map.putIfAbsent(103,"Gr");
        System.out.println(map);

        map.remove(103,"Grapes");
        System.out.println(map);






    }
}

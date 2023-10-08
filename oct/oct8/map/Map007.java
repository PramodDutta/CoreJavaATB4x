package oct.oct8.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map007 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(6,"Tushar");
        hm.put(12,"Ashu");
        hm.put(5,"Zoya");
        hm.put(78,"Yash");
        hm.put(10,"Praveen");
        hm.put(67,"Boby");
        hm.put(1,"Ritesh");

        for(Map.Entry<Integer,String > e: hm.entrySet()){
            System.out.println(e.getKey() +" -> "+ e.getValue());
        }

        System.out.println(" -- -- --");

        Set set = hm.entrySet();
        Iterator iterator =  set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> map = (Map.Entry)iterator.next();
            System.out.println(map.getKey() + " -> "+ map.getValue());
        }



    }
}

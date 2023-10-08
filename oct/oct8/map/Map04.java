package oct.oct8.map;

import java.util.HashMap;
import java.util.Map;

public class Map04 {
    public static void main(String[] args) {

        Map<String, Integer> hm  = new HashMap();
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());

            if(me.getValue() == 100){
                hm.remove(me.getKey());
            }
        }

    }
}

package oct.oct1.AL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AL004 {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList();
        stringList.add("pramod");
        stringList.add("dutta");

        //System.out.println(stringList);

        // Enhanced For loop
        for (String s:stringList){
            System.out.println(s);
        }

        System.out.println("------ ");

        // Interate over the List
        // Uisng Interator Interface
        Iterator iterator = stringList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

package oct.oct7;

import java.util.*;

public class AL001 {
    public static void main(String[] args) {
        List<String> l = new ArrayList();
        l.add("pramod");
        l.add("dutta");
        l.add("autta");

        Collections.sort(l);


        Iterator i = l.iterator();
        while(i.hasNext()){
            // l.add("lucky"); // .ConcurrentModificationException
            // i.add("");

            System.out.println(i.next());
        }
        i.remove();
        System.out.println(l);

//
//
//        for(String s: l ){
//            System.out.println(s);
//        }
//
//
//        ListIterator listIterator =  l.listIterator();
//
//        while(listIterator.hasNext()){
//            //l.add("Lucky");
//            listIterator.add("lucky");
//            System.out.println(listIterator.next());
//        }
//
//        System.out.println(" --- ");
//
//        while(listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }



    }
}

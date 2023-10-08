package oct.oct8;

import java.util.*;

public class Queue01 {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<Integer>();
//        // Arranged in order of processing
//        Integer a = 132;
//        Integer b = 13;
//        Integer c = 1;
//
//        // 1 13 132



        integerQueue.add(133);
        integerQueue.add(12);
        integerQueue.add(1);


//        integerQueue.add("dutta");
//        integerQueue.add("autta");
//        integerQueue.add("putta");


        // 1 13 132

        // 132 13 1


        System.out.println(integerQueue);
//        integerQueue.poll();
//        System.out.println(integerQueue.peek());
//
//        Iterator iterator = integerQueue.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }




    }
}

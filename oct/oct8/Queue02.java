package oct.oct8;

import java.util.PriorityQueue;

public class Queue02 {
    public static void main(String[] args) {

        ATBStudent s1 = new ATBStudent(1,"Pramod","ATB");
        ATBStudent s2 = new ATBStudent(2,"Prajeeth","ATB");

        PriorityQueue<ATBStudent> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(s2);
        priorityQueue.add(s1);

        System.out.println(priorityQueue);

    }
}

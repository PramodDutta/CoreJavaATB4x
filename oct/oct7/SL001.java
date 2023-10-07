package oct.oct7;

import java.util.ArrayList;
import java.util.Spliterator;

public class SL001 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        // Add values to the array list.
        al.add(1);
        al.add(2);
        al.add(-3);
        al.add(-4);
        al.add(5);

        // getting Spliterator object on al
        Spliterator<Integer> splitr1 = al.spliterator();

        Spliterator<Integer> splitr1_split = splitr1.trySplit();

        if(splitr1_split != null) {
            System.out.println("Output from splitr2: ");
            splitr1_split.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("\nOutput from splitr1: ");
        splitr1.forEachRemaining((n) -> System.out.println(n));



    }
}

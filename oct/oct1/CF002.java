package oct.oct1;

import java.util.Vector;

public class CF002 {
    public static void main(String[] args) {
        int[] a = new int[10];
        //  Fixed Size;
        // Insert and Delete -> heavy operation
        // Store only one type of element - similar integer
        a[0] = 10;
        //a[1] = "Pramod";

        // Vector - Vector class is a legacy class (1.2)
        // Java 8 - re written this class
        //

        Vector v = new Vector();
        // Add
        v.add(1);
        v.add("Pramod");
        v.add("Java");

        System.out.println(v);

        // Replace
        v.set(0,"Dutta");
        System.out.println(v);

        // Deletion
        v.remove(0);

        System.out.println(v);


        // Vector - initial capacity - 10
        // 9th -> 20th (internally)

        //


    }
}

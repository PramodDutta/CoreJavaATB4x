package oct.oct1.AL;

import java.util.ArrayList;
import java.util.List;

public class AL002 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Pramod");
        l.add(123); // int also
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.indexOf(123));
        l.remove(1);
        System.out.println(l);
        l.add(1,"Dutta");

        l.set(1,"Kallu");

        System.out.println(l);


        System.out.println(" -------");


        List<String> names_of_students = new ArrayList();
        List<Integer> roll_no = new ArrayList();
        names_of_students.add("Pramod");
        //names_of_students.add(123);
        System.out.println(names_of_students);

        //roll_no.add("pramod");
        roll_no.add(123);
        System.out.println(roll_no);



    }
}

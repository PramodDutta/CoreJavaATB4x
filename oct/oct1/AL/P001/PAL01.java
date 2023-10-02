package oct.oct1.AL.P001;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PAL01 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(2);
        l.add(3);
        l.add(4);

        System.out.println(l);

        // [2,3,4] - Memory

        System.out.println(" --- - - - -");

        List l2 = new LinkedList();
        l2.add(3);
        l2.add(4);
        l2.add(5);

        System.out.println(l2);



    }
}

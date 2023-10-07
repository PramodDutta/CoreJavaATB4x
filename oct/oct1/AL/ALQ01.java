package oct.oct1.AL;

import java.util.ArrayList;
import java.util.List;

public class ALQ01 {
    public static void main(String[] args) {
        List list = List.of("A","B");
        ArrayList list1 = new ArrayList();
        list.add("A");
        list.add("B");

        // Adding new element, Find error
        list.add("C");
        list1.add("C");
    }
}

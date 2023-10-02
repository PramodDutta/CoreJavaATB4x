package oct.oct1.AL;

import java.util.Enumeration;
import java.util.Vector;

public class Vector001 {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        // Stack, Hastable, Propetires, Dictionalry

        // Adding elements
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        Enumeration e = vector.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }





    }
}

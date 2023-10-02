package oct.oct1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CF003 {
    public static void main(String[] args) {
//        List list  = new List();
        List list = List.of("orange","apple","banana","sugar",123,"orange");
        System.out.println(list);


        System.out.println(list.get(3));
        System.out.println(list.size());
        System.out.println(list.indexOf(123));
        System.out.println(list.indexOf("pramod"));
        System.out.println(list.isEmpty());

        list.add("pramod"); // Add is not allowed Why? Static Immutable List
        System.out.println(list);



        // API Automation
        List url = List.of("https://app.vwo.com","https://qa.vwo.com");
        List college = List.of("AIT","IIT");




    }
}

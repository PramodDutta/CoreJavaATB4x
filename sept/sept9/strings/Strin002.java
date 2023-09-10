package sept.sept9.strings;

public class Strin002 {
    public static void main(String[] args) {

        String s1= "Pramod"; // Stirng pool
        String s2 = new String("Pramod"); // heap area
        String s5 = new String("Pramod"); // heap area
        String s3 = "Pramod";
        String s4 = "Pramod";

        //5 Ref, 3 String
        // Pramod - SP - s1, s3, s4 ( s1, s3 ) - Ref
        // Pramod - HA - s2,  s5  ( s2 not eq s5)

        String s6 = new String("pramod");
        String s7 = "pramod";

        // ==  equals ()

        System.out.println(s1.contains("a"));
        System.out.println(s1.length());
        System.out.println(s1.indexOf("a"));

        //
        String s10 = "Pramod@Dutta";

        System.out.println(s10.split("@")[0]);
        System.out.println(s10.split("@")[1]);





    }
}

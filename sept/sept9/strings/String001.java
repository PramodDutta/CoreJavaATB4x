package sept.sept9.strings;

public class String001 {
    public static void main(String[] args) {

        String s1 = "Pramod"; // String pool
        String s2 = new String("Pramod"); // Heap Area

        // s1 -> Ref
        // s2 -> Ref

        String s3 = " Pramod "; // pramod
        //s1 -> s3 -> "Pramod" // string pool

        System.out.println(s1.charAt(3));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());

        System.out.println(s1.equalsIgnoreCase("pramod"));




    }
}

package sept.sept10;

public class String001 {
    public static void main(String[] args) {

        //== operator checks if two string references point to the same memory location.
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);


        // equals method compares the actual content of the strings,
        // checking if they contain the same sequence of characters.

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


    }
}

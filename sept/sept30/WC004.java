package sept.sept30;

public class WC004 {
    public static void main(String[] args) {
        Character ch = 'a';
        // unboxing - Character object to primitive conversion
        char a = ch;
        System.out.println(Integer.max(34,54));

        Integer values = 10;
        Integer values2 = 10;
        values++;
        System.out.println(values);
        System.out.println(values == values2);
        int x = 10;
        int y = 10;
        System.out.println(x == y);

        String s1 = "Pramod"; // String pool
        String s2 = "Pramod"; // String pool
        String s3 = new String("Pramod"); // new = Heap area
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

    }
}

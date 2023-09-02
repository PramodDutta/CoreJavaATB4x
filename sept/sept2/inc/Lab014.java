package sept.sept2.inc;

public class Lab014 {
    public static void main(String[] args) {
        // increment
        // pre and post
        //++b = pRE
        //b++ - Post
        // b = b+1;

        int b = 99;
        // Pre
//        b = ++b;// Plz increment me before assign
//        b = b++;// Plz assign me before increment

        // left to right and exp and value of b
        System.out.println(++b + ++ b);
        // ++b ->   exp = 100   b = 100
        // + -> cont
        // ++b -> b= 101, exp = 101
        System.out.println(b);


    }
}

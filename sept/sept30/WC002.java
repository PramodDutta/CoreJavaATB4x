package sept.sept30;

public class WC002 {
    public static void main(String[] args) {
        // Primitive to String
        int x = 123;
        //String s1 = x;
        //String s1 = (String)x;

        String s1 = x+""; // Not recommended
        String s2 = String.valueOf(x); // This is the correct one
        String s3 = Integer.toString(x);


        double d = 90.87;
        String sd1 = String.valueOf(d);
        String sd2 = Double.toString(d);


        // String tO PRIMITIVE
        String sp = "123";
        // parseOX
        int px = Integer.parseInt(sp);
        Integer pxwc = Integer.valueOf(px);





    }
}

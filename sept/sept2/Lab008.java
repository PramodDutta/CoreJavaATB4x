package sept.sept2;

public class Lab008 {
    public static void main(String[] args) {
//        //
//
//        byte b = 10;
//        byte b1 = 11;
//        System.out.println(b+b1);
//
//        char c1 = 'A';
//        char c2 = 'B';
//        System.out.println(c1+c2);

        String s1 = "Pramod";
        String s2 = "Dutta";
//        System.out.println(s1+s2);

        int a = 10;
        int b = 20;
//        System.out.println(a+b);

        // left -> right

        System.out.println(a+b+s1+s2);
        //String + int - > String
        System.out.println(s1+s2+a+b);
        System.out.println(s1+s2+(a+b));
         // PramodDutta + 30 ->  PramodDutta30

        System.out.println('A'+'B');





    }
}

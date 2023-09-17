package sept.sept16;

public class SB001 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("TTA");
        StringBuffer sb2=new StringBuffer("TTA");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2)); // Object Class
        System.out.println(sb1.toString().contentEquals(sb2.toString()));


    }
}

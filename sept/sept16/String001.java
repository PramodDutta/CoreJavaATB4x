package sept.sept16;

public class String001 {
    public static void main(String[] args) {

        String name = "The Testing Academy"; //sp
        String name1 = "The Testing Academy"; // SP
        String name2 = new String("the Testing Academy");

        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));



    }
}

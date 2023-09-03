package sept.setp3;

public class Lab008 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int max = 0;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);


    }
}

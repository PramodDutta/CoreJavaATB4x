package sept.sept16;

import java.util.Scanner;

public class SB002 {
    public static void main(String[] args) {
        // Reverse a String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        StringBuilder sb1;
        sb1  = new StringBuilder(sc.next());
        sb1.reverse();

        System.out.println(sb1);
    }
}

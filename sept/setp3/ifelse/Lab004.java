package sept.setp3.ifelse;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        // a, b, c -
        // max - ? terminary operator? - T  ?

        // How to get input from User?


        System.out.println("Enter the value of a,b,c\n I will give you the maximum of three");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Your inputs are " + a + " " + b + " " + c);

        if (a > b && a > c) {
            System.out.println("Max is " + a);
        }
        if (b > a && b > c) {
            System.out.println("Max is " + b);
        }
        if (c > a && c > b) {
            System.out.println("Max is " + c);
        }


    }
}

package sept.setp3.switchdemo;

import java.util.Locale;
import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {

        // vowels - 5 aeiou
        System.out.println("Enter a char");
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        c = c.toLowerCase(Locale.ROOT);

        switch (c){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("Not a Vowel");


        }



    }
}

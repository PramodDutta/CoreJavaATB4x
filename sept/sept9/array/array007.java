package sept.sept9.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array007 {
    public static void main(String[] args) {

        // Take input - n = 5
        // 90, 91, 45, 89, 93
        // Max -> 93

        System.out.println("Enter Subject count");
        Scanner sc = new Scanner(System.in);
        int total_subjects = sc.nextInt();

        int[] marks = new int[total_subjects];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks one by one");
            marks[i] = sc.nextInt(); // marks [0], marks [1], marks[2]
        }

        System.out.println(" Here is your marks");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println("Here is your marks of sub -> " + marks[i]);
        }

        // 91, 90, 93
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]> max){
                max = marks[i];
            }
        }


        for (int i = 0; i < marks.length ; i++) {
            System.out.println("Here is your marks of sub -> " + marks[i]);
        }

        // Collections - in built functions that you can use

        System.out.println("Max is -> "+max);





    }
}

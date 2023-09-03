package sept.setp3.switchdemo;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {

        // Simulate a traffic light with three possible states: "Red," "Yellow," and "Green.
        // "Write a program that takes an integer representing the current
        // state of the traffic light and prints the next state.
        // Use a switch statement to cycle through the states.

        // 1 -> Red -> Yellow
        // 2 -> Yellow -> Green
        // 3 -> Green -> Red

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1-3 which state you are in");
        int state = sc.nextInt();

        // Red -> Yellow -> Green -> rED -> India
        // Red -> Green -> USA
        // Yellow -> Red -> Green -> Canada


        switch (state) {
            default:
                System.out.println("Invalid State");
            case 1:
                System.out.println("Next will be Yellow");
                break;
            case 2:
                System.out.println("Next will be Green");
                break;
            case 3:
                System.out.println("Next will be Red");
                break;


        }
        System.out.println();


    }
}

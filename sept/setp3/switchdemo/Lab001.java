package sept.setp3.switchdemo;

import java.util.Scanner;

public class Lab001 {

    public static void main(String[] args) {

        // Take a User input - 1-7
//         day 1 - monday
//            day 3 -> wed

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        int day = sc.nextInt();


        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid Day!!");
        }
        System.out.println("Outside the Loop = End");






    }


}

package sept.setp3.ifelse;

public class Lab011 {
    public static void main(String[] args) {

         //10% 2 == 0 -> dIV

        // Create a program that determines whether a
        // given year is a leap year.
        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        int year = 2023;
        // (year % 4 == 0 && year % 100 != 0) || year % 400 ==0

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }


    }
}

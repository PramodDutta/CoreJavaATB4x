package sept.setp3;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {

        //Grade Calculator

//        Write a program that calculates and displays the letter grade for
//        a given numerical score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59


        // Take input from the user - grade
        // grade  > 90  and grade < 100 ->  sout - "A"
        // ELSE of grade > 80 and grade < 89 sout - B


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();
        char grade = 'A';
        if(score >=90 && score <=100){
            grade = 'A';
        }
        else if( score >=80 && score < 90){
            grade = 'B';
        }
        else if( score >=70 && score < 80){
            grade = 'C';
        }
        else if( score >=60 && score < 70){
            grade = 'D';
        }else {
            grade = 'F';
        }

        System.out.println("Your Grade is " + grade);




    }
}

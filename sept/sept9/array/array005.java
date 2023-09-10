package sept.sept9.array;

import java.util.Scanner;

public class array005 {
    public static void main(String[] args) {
        System.out.println("Enter a how many elemnts you want to store");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] user_array = new int[n];

        for (int i = 0; i < user_array.length; i++) {
            System.out.println(user_array[i]);
        }



    }
}

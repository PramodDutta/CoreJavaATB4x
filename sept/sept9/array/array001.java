package sept.sept9.array;

public class array001 {
    public static void main(String[] args) {

        // Colleciotn of Similar elements
        // 90, 91, 89, 87
        // Mark in the 10th class
        int math_marks = 90;
        int sc = 91;
        int sst = 89;
        int hindi = 87;

        // Arrays
        int [] numbers = {90,91,89,87};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
//        System.out.println(numbers[4]); // Tight Slap

        System.out.println(" -- - - - - - - -");

        int [] numbers2 = new int[4];
        numbers2[0]= 10;
        numbers2[1]= 11;
        numbers2[2]= 12;
        numbers2[3]= 13;
//        numbers2[4]= 13;
        System.out.println(numbers2[3]);



    }
}

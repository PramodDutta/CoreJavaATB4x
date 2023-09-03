package sept.setp3.forloop;

public class Lab005 {
    public static void main(String[] args) {

        //  go from 1 to 10
        // if you find i = 5 break
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
            if( i == 5){
                System.out.println("Found 5");
            }
        }
        System.out.println("End");

    }
}

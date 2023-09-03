package sept.setp3.switchdemo;

public class Lab007 {
    public static void main(String[] args) {
        int item = 001;
        switch (item){
            // JDK >11
            case 001,002,003:
                System.out.println("from 1 to 3");
                break;
            case 004,005,007:
                System.out.println("from 4 to 7");
                break;
            default:
                System.out.println("Not found!!");


        }
    }
}

package sept.setp3.switchdemo;

public class Lab009 {
    public static void main(String[] args) {

        int item = 001;
        switch (item){
            // jdk > 11
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 005 -> System.out.println("005");
            default -> System.out.println("Default");
        }


    }
}

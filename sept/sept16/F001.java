package sept.sept16;

public class F001 {
    public static void main(String[] args) {
        // Function ?
//        printPramod();
        int out= add(2,3);
        System.out.println(out);
        nameoffunction();
    }

    static void printPramod(){
        System.out.println("Pramod");
    }

    static boolean nameoffunction(){
        System.out.println("Boolean");
        return true;
    }

    static int add(int a, int b) {
        return a + b;
    }


}

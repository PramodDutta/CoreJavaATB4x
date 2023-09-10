package sept.sept9;

public class Do005 {
    public static void main(String[] args) {

        // Loop and Condition
        int i = 1;
        do {
            System.out.println("Execute me multiple times till "+i);
            // call login user
            // do something multiple times
            if( i> 2){
                break;
            }
            i++;
        } while (i < 10);
    }


}

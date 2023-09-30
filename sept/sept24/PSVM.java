package sept.sept24;

import java.io.File;
import java.io.FileInputStream;

public class PSVM {
    public static void main(String[] args) {
        // Pass the argument - "10" - y
        // Convert this into the 10 wrapper of Integer
        //  x= 10/y
        // print x;
        String s1 = args[0]; // 1 java.lang.ArrayIndexOutOfBoundsException - No value
        int y = Integer.parseInt(s1); // 2 - java.lang.NumberFormatException ( pramod -> int? )
        int x = 10/y; //3 - java.lang.ArithmeticException ( 0)
        System.out.println(x);

        //JVM will be Initialized
        //Create and Starts the main Thread.
        //main Thread will do the following tasks
        //1)Collects the Command Line Arguments
        //2)Creates the String array with CLA
        //3)Calls main method by passing String array as Parameter:
            //PSVM.main(str);
        //Now Control will be transfered from main Thread to main method
        //Control will come back to main thread in two ways.
        // Exceptiotn -> Main thread will terminated

        // Exception???





    }
}



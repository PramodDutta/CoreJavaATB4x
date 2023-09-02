package sept.sept2;

public class Lab012 {
    public static void main(String[] args) {

//
         byte b1 = 10; //
         int a1 = (int)b1; // Wide - JVM  - You want to add small bucket to bigger bucket that is fine
        System.out.println(a1);
//
        int a = 90;
        byte b = (byte)a; // Narrow // Int is big basket ->  small basket- Narrow
        System.out.println(b);
//

        int course = 10;
        float gst = 1.18f;
        int total = course+(int)gst;
        System.out.println(total);





    }
}

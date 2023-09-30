package sept.sept30;

public class Ex002 {
    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
            // some code here which another type of exception
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

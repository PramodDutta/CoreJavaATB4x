package sept.sept30;

public class Ex005 {
    public static void main(String[] args) {
        try {
            String s1 = null;
            s1.trim();
            // open a file / exception occurs

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            // somecode to be executed 100%
            System.out.println("I am done and finally");
            // driver.close();
            // db.close()
            // fileIn.close();
        }

    }
}

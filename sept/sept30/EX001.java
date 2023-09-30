package sept.sept30;

public class EX001 {
    public static void main(String[] args) {
        //        File a = new File("C:/dog.txt");
//        FileInputStream a2 = new FileInputStream(a);

        String name = "pramod";
        try{
            name.trim();
            int a = 10/0;
            Integer.parseInt("pramod");
            // some code here which will give Arthematic exception
        }catch (Exception e){
            //        }catch (Throwable e){
//        }catch (Error e){
            System.out.println("Can't to trim for NULL ref");
        }
        System.out.println("This line I want to execute");
    }
}

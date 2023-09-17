package sept.sept16;

public class F004 {
    public static void main(String[] args) {
        //
        String u = username();
        System.out.println(u);
        boolean output = login();
        System.out.println(output);

    }

    static boolean login(){
        if(username() == "pramod"){
            return true;
        }else {
            return false;
        }
    }

    static boolean anotherfunc2(){
        String o =username();
        return true;
    }



    static String username(){
        return "pramod";
    }
}

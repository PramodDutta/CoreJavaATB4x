package sept.sept16;

public class F003 {
    public static void main(String[] args) {
        String o = appDutta("Pramod");
        System.out.println(o);
        print("Pramod");
    }

    static String appDutta(String s){
        System.out.println("Return with Param");
        return s+"Dutta";
    }

    static String appDutta2(){
        System.out.println("Return and Non Param");
        return "Dutta";
    }

    static void print(String s){
        System.out.println("Non Return with Param");
        System.out.println("Print some"+ s);
    }
    static void print(){
        System.out.println("Non Return and Non Param");
    }
}

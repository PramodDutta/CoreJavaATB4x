package sept.setp17;

public class SV001 {
    public static void main(String[] args) {

//        SV_1 h=new SV_1();
//        System.out.println(h.b);
//        h.b=99;
//        System.out.println(h.b);

//        System.out.println(SV_02.b);

        new SV_3().b = 99;
        System.out.println(new SV_3().b);


        SV_04 h=null;
        System.out.println(h.b);
        System.out.println(SV_04.b);




    }
}

class SV_1 {
    static int b;
    int a;
}
class SV_02 {
    static int b;
}

class SV_3 {
    static int b;
}

class SV_04 {
    static int b;
}
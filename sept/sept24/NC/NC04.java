package sept.sept24.NC;

public class NC04 {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.print_scret();
    }
}

class Outer{
    static int uu = 10;
    int a = 10;
    void print_scret(){
        System.out.println("Outer Class");
        new Inner().m2_scret();
    }

    class Inner{
        static int screat =  90;
        void m2_scret(){
            System.out.println("Inner Scret" + screat);
        }
    }
}

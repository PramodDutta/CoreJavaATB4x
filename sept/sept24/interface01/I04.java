package sept.sept24.interface01;

public class I04 {
    public static void main(String[] args) {
        Calc c = new NormalCalc();
        c.cosTheta();
        Calc.SinTheta();
    }
}

interface Calc{
    void add();
    void sub();
    void div();

    default void cosTheta(){
        System.out.println("costtheta");
    }
    static void SinTheta(){
        System.out.println("Sin");
    }

}

class NormalCalc implements Calc{

    @Override
    public void add() {
        int a = 10;
        int b = 20;
        System.out.println(" A +B" +  a+b);
    }

    @Override
    public void sub() {

    }

    @Override
    public void div() {

    }
}

class Scifi implements Calc{

    void m1(){

    }

    @Override
    public void add() {
        double a = 10.34;
        double b = 234.234;
        System.out.println(a+b);
    }

    @Override
    public void sub() {

    }

    @Override
    public void div() {

    }
}
package sept.sept23.Abs.Abs.ex1.example;

public class E4 {
    public static void main(String[] args) {
        StaticDemo.m1();
        new P34().m2();

    }
}

abstract class StaticDemo{
    int a = 10;
    static void m1(){
        System.out.println("Static");
    }

    void m2(){
        System.out.println("m2");
    }
}

class P34 extends StaticDemo{

}

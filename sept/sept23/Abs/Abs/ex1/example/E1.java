package sept.sept23.Abs.Abs.ex1.example;

public class E1 {
    public static void main(String[] args) {
        AbstractClass001 a = new P();
        a.m1(); //dynamic dispatch
    }
}


abstract class AbstractClass001{
    abstract void m1();
}

class P extends AbstractClass001{

    @Override
    void m1() {
        System.out.println("Imp");
    }
}
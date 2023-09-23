package sept.sept23.Abs.Abs.ex1.example;

public class E2 {
    public static void main(String[] args) {

    }
}

abstract class Shape{
    abstract void area();
    static void f(){
        System.out.println("F1");
    }
}

class Sq extends Shape{

    @Override
    void area() {
        System.out.println("area ");
        Shape.f();
    }
}

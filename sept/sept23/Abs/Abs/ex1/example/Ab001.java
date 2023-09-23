package sept.sept23.Abs.Abs.ex1.example;

public class Ab001 {
    public static void main(String[] args) {
        //GF gf = new GF();
        // F f = new F();
        GF s = new Son();
        F s2 = new Son();
        Son s3 = new Son();
        s.loan();
    }

}

abstract class GF{
    abstract void loan();
}

abstract class F extends GF{

}

class Son extends F{

    @Override
    void loan() {
        System.out.println("I have to give!!");
    }
}

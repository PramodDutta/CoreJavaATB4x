package sept.sept24.interface01;

public class I03 {
    public static void main(String[] args) {
        //ICanFly i = new ICanFly();
        ICanFly i = new Bird();
        i.fly();
        i.eat();

    }
}

interface ICanFly{
    void fly(); // public abstract
    default void eat(){
        System.out.println("Default Fn");
    }
    static void sleep(){
        System.out.println("Static Fn");
    }
}


class Bird implements ICanFly{

    @Override
    public void fly() {
        System.out.println("I am Flying like a Bird!!");
    }

}

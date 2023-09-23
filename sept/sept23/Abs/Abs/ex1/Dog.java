package sept.sept23.Abs.Abs.ex1;

public class Dog extends Animal{

    void bark(){
        System.out.println("bark");
    }

    @Override
    void say() {
        System.out.println("say");
    }

    @Override
    void say2() {
        System.out.println("say2");
    }
}

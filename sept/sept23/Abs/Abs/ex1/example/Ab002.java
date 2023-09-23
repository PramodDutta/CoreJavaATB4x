package sept.sept23.Abs.Abs.ex1.example;

public class Ab002 {
    public static void main(String[] args) {


    }
}

abstract class Person01 {
    abstract void say();
    void eat(){
        System.out.println("Hello eat from Person");
    };
}

class Student1 extends Person01{
    @Override
    void say() {
        System.out.println("Student eat()");
    }
}
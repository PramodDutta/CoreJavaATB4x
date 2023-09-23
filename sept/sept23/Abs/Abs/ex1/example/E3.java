package sept.sept23.Abs.Abs.ex1.example;

public class E3 {
    public static void main(String[] args) {

    }
}

abstract class Person {
    abstract void sleeping();
    abstract void walking();
}

abstract class Student extends Person {

    void sleeping() {
        System.out.println("dadasd");
    }
}
class CurrentStudent extends Student{

    @Override
    void walking() {
        System.out.println("dadasd");
    }
}
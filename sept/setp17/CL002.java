package sept.setp17;

public class CL002 {

    public static void main(String[] args) {
        Person h=new Person();
        Person h2=new Person(23);
        Person h3=new Person(33,true);
        System.out.println(h.a);
        System.out.println(h2.a);
        System.out.println(h3.a);
        System.out.println(h3.b);
        System.out.println(Person.c);
        System.out.println(h3.c);
    }
}

class Person {
    int a;
    boolean b;

    static int c = 90;

    // Default
    Person(){
        this.a = 10;

    }

    // Parameter Constructor
    Person(int b){
        this.a = b; //  h2.a
    }

    Person(int b,boolean a){
        this.a = b;
        this.b = a;
    }
}


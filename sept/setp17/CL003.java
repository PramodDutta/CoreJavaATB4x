package sept.setp17;

public class CL003 {

    public static void main(String[] args) {

        Person02 h1=new Person02();
        Person02 h2=new Person02();
        Person02 h3=null;
//        h2.run();
//        h3.run();

        System.out.println(h1.a+"\t"+h2.a);
        h1.a=99;
        System.out.println(h1.a+"\t"+h2.a);





    }
}


class Person02 {
    int a;
    void run(){
        System.out.println("Run called");
    }
}
package sept.sept24.NC;

public class AC01 {
    public static void main(String[] args) {
            A a = new A() {
                @Override
                public void m1() {
                    System.out.println("m1");
                }
            };
            a.m1();
    }
}

interface A{
    void m1();
}

//class PRAMOD implements A{
//
//    @Override
//    public void m1() {
//        System.out.println("Yes m1");
//    }
//}

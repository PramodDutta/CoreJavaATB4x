package sept.sept24.NC;

public class NC02 {

    public static void main(String[] args) {
        OC o = new OC();
        System.out.println(o.a);


        OC.SNC oo = new OC.SNC();
        oo.show();
        System.out.println(OC.SNC.p);
    }

}


class OC{
    static int o = 10;
    int a = 109;

    static class SNC{
        static int p = 10;
        void show(){
            System.out.println(o);
            //System.out.println(a);

            class A1{
                class A2{
                    class A3{
                        class A4{

                        }
                    }
                }
            }
        }
    }

}

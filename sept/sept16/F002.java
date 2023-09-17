package sept.sept16;

public class F002 {
    public static void main(String[] args) {
       // calc
       // a,b -> a+b
       // a,b -> a-b
        int o_add =  add(23,4);
        double o_sub =  sub(3.12,4);
        System.out.println(o_add);
        System.out.println(o_sub);

        for (int i = 0; i < 10; i++) {
            print();
        }

    }

    static int add(int a,int b){
        return a+b;
    }

    static double sub(double x,int y){
        return x-y;
    }

    static void print(){
        System.out.println("I will print something");
    }

}

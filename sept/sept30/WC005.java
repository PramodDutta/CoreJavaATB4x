package sept.sept30;

public class WC005 {
    public static void main(String[] args) {

        Work w = new Work();
        w.show(1,3);
        byte b1 = 1;
        byte b2= 3;
        w.show(b1,b2);
        // Argument are primitve in Nature


    }
}


class Work{
    void show(int a, int b){
        System.out.println("1");
    }
    void show(Byte a, Byte b){
        System.out.println("2");
    }
    void show(byte a, byte b){
        System.out.println("3");
    }

    void show(byte...a){
        System.out.println("4");
    }

}
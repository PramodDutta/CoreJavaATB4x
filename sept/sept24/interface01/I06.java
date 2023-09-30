package sept.sept24.interface01;

public class I06 {
    public static void main(String[] args) {

    }
}


interface Inter06 {
    void m1();

    int A = 10;
}

interface Inter062 {
    void m2();

    int B = 11;
}

class HH implements Inter06, Inter062 {


    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}
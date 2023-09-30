package sept.sept24.interface01;

public class I002 {
    public static void main(String[] args) {

    }
}

interface PP{
    int a = 10; // final static variable - Constant
    void m1();
}

abstract class AB{
    abstract void say();
}

abstract class New implements PP{
    int a2 = 10;
}

class Pramod extends New{

    @Override
    public void m1() {

    }
}
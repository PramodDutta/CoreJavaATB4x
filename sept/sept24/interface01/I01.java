package sept.sept24.interface01;

public class I01 {
    public static void main(String[] args) {

        StandLogin s1 = new AdminLogin();
        AdminLogin adminLogin = new AdminLogin();
        StandLogin s2 = new UserLogin();
        StandLogin s3 = new BuyersLogin();
        s1.login();
        s1.m1();
        adminLogin.m1();
//        System.out.println(s1.a);


        s2.login();
        s3.login();

    }
}
interface A{
    void m1();
}
interface B{
    void m1();
}

interface StandLogin{
    double PIE = 3.14; // Public static final variable

    void login();
    default void m1(){
        System.out.println("m1");
    }
    default void m2(){
        System.out.println("m2");
    }
    default void m3(){
        System.out.println("m3");
    }
}

class AdminLogin implements StandLogin,A{

    @Override
    public void login() {
        System.out.println("Admin Login");
    }

    @Override
    public void m1() {
        StandLogin.super.m1();
    }
}

class UserLogin implements StandLogin,B{
    @Override
    public void login() {
        System.out.println("User Login");
    }

    @Override
    public void m1() {
        StandLogin.super.m1();
    }
}

class BuyersLogin implements StandLogin{
    @Override
    public void login() {
        System.out.println("Buyers Login");
    }
}


class C implements A,B{

    @Override
    public void m1() {
        System.out.println("Solved the diamond problem!!");
    }
}



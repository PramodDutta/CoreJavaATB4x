package sept.setp17;

public class VWOLogin {

    // Attributes / Properties

    String email; // Instance Variables
    String password;
    String button;

    static String title;


    VWOLogin(){
        // Have a small name as the Class
        // No return type not even the void
        // Default - no parameter
        System.out.println("Hello from Default Const");
        //this.email = "amit@gmail.com";
    }

    VWOLogin(String email1,String pass1){
        // Have a small name as the Class
        // No return type not even the void
        // Default - no parameter
        System.out.println("Hello from Param Const" + email1);
        this.email = email1;
        this.password = pass1;
//        VWOLogin.title = "VWO App";

    }








    // Methods / Functions / Behav

    boolean login(){
        return true;
    }

    void rememberMeClick(){

        int a = 10; // Local Variable
        System.out.println(a);

    }

    // IIB - "Instance Initialization Block."
    {
        System.out.println("Hello from IIB");
    }
    {
        System.out.println("Hello from IIB2");
    }

    static {
        System.out.println("I am SIB");
        // First line to be executed
        // Database Connection
        // driver.get open a browser
        // open a file
        // read a csv orEXCEL
    }







    @Override
    public String toString() {
        return "VWOLogin{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", button='" + button + '\'' +
                '}';
    }
}

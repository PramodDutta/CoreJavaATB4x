package sept.setp3.switchdemo;

public class Lab003 {
    public static void main(String[] args) {


        String browser= "chrome";

        switch (browser){
            case "chrome":
                System.out.println("code to Start the chrome");
                break;
            case "firefox":
                System.out.println("code to Start the firefox");
                break;
            default:
                System.out.println("Invalid Browser");
        }


    }
}

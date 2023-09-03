package sept.setp3.switchdemo;

public class Lab008 {
    public static void main(String[] args) {

        String code = "w";
        String msg = switch (code){
            case "w":
                System.out.println("Hi");
                yield "Yes";
            default:
                System.out.println("Bye");
                yield "Default";
        };
        System.out.println(msg);




    }
}

package sept.sept30;

public class Ex006 {
    public static void main(String[] args) {
        ProblemF problemF = new ProblemF();
        int a = problemF.show();
        System.out.println(a);
    }
}

class ProblemF{
    int a = 10;

    int show() {

        try {
            a = 10 / 0;
            System.out.println("In Try -> " + a);
            return a;
        }catch (Exception e) {
            try {
                a = 20 / 0;
            } catch (Exception e1) {
                System.out.println("Yes");
            }
            System.out.println("In Catch -> " + a);
            return a;
        }

    }
}
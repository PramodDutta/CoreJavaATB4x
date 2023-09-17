package sept.sept16;

public class String006 {
    public static void main(String[] args) {

        String s = "Pramod";
        String s2 = "Dutta";
        for (int i = 0; i < 1000; i++) {  // 1000+
            s2 = s2+s;
        }

        StringBuffer sb = new StringBuffer("Pramod");
        for (int i = 0; i < 1000; i++) {
            sb.append(s2);
        }

        // Use String Buffer when values changes a lot
        // Less time and Thread Safe

        StringBuilder sbb = new StringBuilder("Dutta");
        // Not Thread Safe



    }
}

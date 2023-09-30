package sept.sept30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw01 {
    public static void main(String[] args) throws Exception {
        String path = "C:/dog.txt";
        FileInputStream f = new FileInputStream(path);
    }
}

package sept.sept30;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TT01 {
    public static void main(String[] args) {

        String path = "C://a.txt";
        File file = new File(path);

        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //file.close();
        }
    }
}

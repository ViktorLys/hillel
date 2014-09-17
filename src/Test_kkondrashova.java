import java.io.File;
import java.io.IOException;

public class Test_kkondrashova {


    private String fileName = "kkondrashova.txt";

    public static void createFile(String path, String filename) {
        File file = new File(path, filename);
        if (!file.exists()) {//
            try {
                file.createNewFile();  //

            } catch (IOException e) {
                //
                e.printStackTrace();
            }
        }

    }

}



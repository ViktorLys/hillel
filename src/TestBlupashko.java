/**
 * Created by Богдан on 17.09.2014.
 */
import java.io.File;
import java.io.IOException;

public class TestBlupashko {

    private String path = "c:/111"; // type path here
    private String fileName = "blupashko.txt";

    public void createBlupashkoFile(){
        File myFile = new File(path, fileName);
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
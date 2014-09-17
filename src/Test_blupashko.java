/**
 * Created by Богдан on 17.09.2014.
 */
import java.io.File;
import java.io.IOException;

public class Test_blupashko {

    private String path = "c:/111"; // type path here
    private String fileName = "blupashko.txt";

    public void createFile(String fileName){
        File myFile = new File(path, fileName);
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFile(){
        File myFile = new File(path, fileName);
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
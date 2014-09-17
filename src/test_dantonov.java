import java.io.File;
import java.io.IOException;


public class test_dantonov {

    public static void createNewFile() throws IOException {

        File f = null;
        boolean bool = false;

        try{

            f = new File("dantonov.txt");

            bool = f.createNewFile();

            System.out.println("File kkondrashova.txt created: "+bool);

            f.delete();


            bool = f.createNewFile();

        }catch(Exception e){
            e.printStackTrace();

        }
    }

}


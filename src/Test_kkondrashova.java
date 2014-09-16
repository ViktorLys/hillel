import java.io.File;
import java.io.IOException;

public class Test_kkondrashova {

  public static void createNewFile() throws IOException {

        File f = null;
        boolean bool = false;

        try{
            // create new file
            f = new File("kkondrashova.txt");

            // tries to create new file in the system
            bool = f.createNewFile();

            // prints
            System.out.println("File kkondrashova.txt created: "+bool);

            // deletes file from the system
            f.delete();

            // tries to create new file in the system
            bool = f.createNewFile();

        }catch(Exception e){
            e.printStackTrace();

        }
    }

}





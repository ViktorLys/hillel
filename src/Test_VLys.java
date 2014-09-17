import java.io.File;
import java.io.IOException;

public class Test_VLys {
    private static void exsists(File file) {
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File doesn't exist");
        }
    }

    public void createFile(String path) throws IOException {
        File file = new File("VLys.txt");

        exsists(file);

        file.createNewFile();

        exsists(file);

        file.renameTo(new File("VLys1.txt"));

        System.out.println("Last modified: " + file.lastModified());


        System.out.println("Name: " + file.getName());


        System.out.println("Parent: " + file.getParent());

        file.delete();


    }
}


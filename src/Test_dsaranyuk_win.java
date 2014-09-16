import java.io.*;

public class Test_dsaranyuk_win {

    public static void main(String[] args) {

        createFile();
    }

    public static void createFile(){
        try {

            OutputStream outputStream = new FileOutputStream("dsaranyuk.txt");

//  Заполнение открытого файла кодом из класса от куда был вызван метод.
//  Как сделать ссылку на файл в котором будет вызываться статический метод? - РЕШЕНО, через стек-трейс!!!
//      - Thread.currentThread().getStackTrace()[1].getClassName()
            String pathInputFile = Thread.currentThread().getStackTrace()[1].getFileName();
            InputStream inputStream = new FileInputStream("src\\" + pathInputFile);

            while (inputStream.available()>0) {
                outputStream.write(inputStream.read());
            }

            inputStream.close();
            outputStream.close();
            System.out.println("File was created.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

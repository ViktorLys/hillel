public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello, Arthur from Denis : Alexandr! :P");
        System.out.println("Hello, Arthur from Kate :)!");

        System.out.println("Hello, Arthur from Bogdan :)!");
        System.out.println("Hello, Arthur from  :)!");

        System.out.println("Hello, Arthur, from Margo!)");
        System.out.println("Заработало!!!");

        String newFileName = "test.txt"; // enter file name like test.txt
        Test_blupashko blupashko = new Test_blupashko();
        blupashko.createFile(newFileName);
        blupashko.createFile();
    }
}


import java.io.*;
import java.io.File;import java.lang.Exception;import java.lang.System;import java.util.Date;
import java.text.SimpleDateFormat;


public class createFile {

        public static void createNewFile() {
            File f = null;
            boolean bool = false;
            Date date = new Date();
            SimpleDateFormat format1 = new SimpleDateFormat("ddhhmm");
            try {
                // create new file
                f = new File("test_AStepurko_" + format1.format(date) + ".txt");

                // tries to create new file in the system
                bool = f.createNewFile();

                // prints
                System.out.println("File created: " + bool);

                // deletes file from the system
                f.delete();

                // delete() is invoked
                System.out.println("delete() method is invoked");

                // tries to create new file in the system
                bool = f.createNewFile();

                // print
                System.out.println("File created: " + bool);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }}


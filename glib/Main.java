package glib;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            File f1 = new File("./glib/myFiles/Data.txt");

            if (f1.createNewFile()) {
                System.out.println("File created: " + f1.getName());
            } else {
                FileWriter myfile = new FileWriter(f1);
                myfile.write("Hi world");
                myfile.close();
                System.out.println("File already exists.");

            }
            Scanner input = new Scanner(f1);
            while (input.hasNextLine()) {
                String data = input.nextLine();
                System.out.println(data + "   ...data from file...");

            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}

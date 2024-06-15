package gMianLib;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        TxtFileManager x = new TxtFileManager("Book.txt");
        x.createFile();
        x.appendRow("row1:omid");
        x.appendRow("row2:Saeed");
        x.appendRow("row3:vahid");
        x.appendRow("row4:mika");
        x.appendRow("row5:saleh");
        x.appendRow("row6:saleh");
        x.appendRow("row7:saleh");
        System.out.println(x.selectCount());
        // x.deleteRow(0);
        x.deleteRow(5);
        System.out.println(x.selectCount());
        System.out.println("gLib");
    }
}

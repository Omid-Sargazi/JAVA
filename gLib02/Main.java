package gLib02;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import gLib02.Common.Book;
import gLib02.FileMaanger.TxtFileManager;
import gLib02.Managers.BooksManager;

public class Main {
    public static void main(String[] args) {

        // TxtFileManager txt = new TxtFileManager("books.txt");
        // txt.createFile();
        // txt.appendRow("Row1 omid sargazi 20605 1360 0320434941");
        // txt.appendRow("Row2 vahid sargazi 1230 1367 3215488410");
        // txt.appendRow("Row3 saeed sargazi 1209 1364 9754210223");
        // System.out.println(txt.selectCount());

        // // txt.Clear();
        // txt.appendRow("Row4 saeed sargazi 1209 1364 9754210223");
        // txt.appendRow("Row5 saeed sargazi 1209 1364 9754210223");
        // System.out.println(txt.selectCount());
        // txt.deleteRow(0);
        // System.out.println(txt.selectCount());

        Book b = new Book();
        b.setBNO("QA20605");
        b.setTitle("C++ Programming");
        b.setAuthor("Saeed Saragzi");
        b.setSubject("Programming, object oriented");
        b.setPages(220);

        BooksManager bm = new BooksManager();
        bm.Insert(b);

        System.out.println("Hello");

    }
}
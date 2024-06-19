package gMianLib;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import gMianLib.Common.Book;
import gMianLib.FileManager.TxtFileManager;
import gMianLib.Managers.BookManager;

public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.setBNO("QA1243");
        b.setTitle("Java Programming");
        b.setAuthor("Omid");
        b.setSubject("OOP, JAVA, C# examples");
        b.setPages(123);
        ////////////////////////////////////////////
        Book b2 = new Book();
        b2.setBNO("QA2222");
        b2.setTitle("Python Programming");
        b2.setAuthor("Saeed");
        b2.setSubject("OOP, C++, Q");
        b2.setPages(1230);
        ///////////////////////////////////////////////
        Book b3 = new Book();
        b3.setBNO("QA3333");
        b3.setTitle("C# Programming");
        b3.setAuthor("Vahid");
        b3.setSubject("OOP, C#, Q");
        b3.setPages(650);
        ////////////////////////////////////////////////
        BookManager bm = new BookManager();
        bm.Insert(b);
        bm.Insert(b2);
        bm.Insert(b3);

        try {
            System.out.println("-------------------------");
            Book[] books = bm.selectAll();
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i].getBNO() + books[i].getAuthor());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("gLib");
    }
}

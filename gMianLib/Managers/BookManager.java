package gMianLib.Managers;

import java.io.FileNotFoundException;

import gLib02.Common.Commons;
import gLib02.FileMaanger.TxtFileManager;
import gMianLib.Common.Book;

public class BookManager {

    private TxtFileManager fm;

    public BookManager() {
        fm = new TxtFileManager("MainBook.txt");
        fm.createFile();
    }

    public void Insert(Book b) {

        String S = b.getBNO() + Commons.SPILITER + b.getTitle() + Commons.SPILITER + b.getPages() + Commons.SPILITER
                + b.getSubject() + Commons.SPILITER + b.getAuthor();
        fm.appendRow(S);
    }

    private Book StrToBook(String S) {
        String A[] = S.split(Commons.SPILITER);
        Book b = new Book();
        b.setBNO(A[0]);
        b.setTitle(A[1]);
        b.setPages(Integer.parseInt(A[2]));
        b.setSubject(A[3]);
        b.setAuthor(A[4]);

        return b;
    }

    public Book[] selectAll() throws FileNotFoundException {
        String S[] = fm.getArrayFromFile();
        Book b[] = new Book[S.length];
        for (int i = 0; i < S.length; i++) {
            b[i] = StrToBook(S[i]);
        }

        return b;

    }
}

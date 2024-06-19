package gLib02.Managers;

import gLib02.Common.Book;
import gLib02.Common.Commons;
import gLib02.FileMaanger.TxtFileManager;

public class BooksManager {
    private TxtFileManager fm;

    public BooksManager() {
        fm = new TxtFileManager("Books.txt");
        // fm.createFile();
    }

    public void Insert(Book b) {

        String S = b.getBNO() + Commons.SPILITER + b.getTitle() + Commons.SPILITER + b.getAuthor() + Commons.SPILITER
                + b.getPages()
                + Commons.SPILITER + b.getSubject();

        fm.appendRow(S);
    }

    private Book Str2Book(String S) {
        String A[] = S.split(Commons.SPILITER);
        Book b = new Book();
        b.setBNO(A[0]);
        b.setTitle(A[1]);
        b.setAuthor(A[2]);
        b.setPages(Integer.parseInt(A[3]));
        b.setSubject(A[4]);
        return b;
    }

    // public Book[] selectAll() {
    // String S[] = fm.getArrayFromFile();

    // Book b[] =
    // }
}

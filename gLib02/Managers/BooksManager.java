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
}

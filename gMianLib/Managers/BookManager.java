package gMianLib.Managers;

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
}

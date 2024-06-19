package SOLID.LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class LibrarySolid implements BookRepository {
    private List<BookSOLID> bookSOLIDs = new ArrayList<>();

    @Override
    public void addBookSolid(BookSOLID book) {
        // TODO Auto-generated method stub
        bookSOLIDs.add(book);

    }

    @Override
    public int getTotalBooksSolid() {
        // TODO Auto-generated method stub
        return bookSOLIDs.size();
    }
}

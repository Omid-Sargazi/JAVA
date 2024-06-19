package SOLID.BookClass;

public class LibraryServiceImpl implements LibraryService {

    private BookRepositorySOLID bookRepositorySOLID;
    private MemberRepository memberRepository;

    public LibraryServiceImpl(BookRepositorySOLID bookRepositorySOLID, MemberRepository memberRepository) {
        this.bookRepositorySOLID = bookRepositorySOLID;
        this.memberRepository = memberRepository;
    }

    @Override
    public void issueBook(String isbn, String memberId) {
        // TODO Auto-generated method stub
        Book book = bookRepositorySOLID.findBookByIsbn(isbn);
        if (book != null) {
            System.out.println("Book " + book.getTitle() + " issued to " + memberId);
        } else {
            System.out.println("Book not found!");
        }

    }

    @Override
    public void returnBook(String isbn, String memberId) {
        // TODO Auto-generated method stub
        Book book = bookRepositorySOLID.findBookByIsbn(isbn);
        if (book != null) {
            System.out.println("Book " + book.getTitle() + " returned by " + memberId);
        } else {
            System.out.println("Book not found!");
        }

    }

}
package OOPAndSOLID;

public class Librarian extends User {
    public Librarian(String name, String id) {
        super(name, id);
    }

    @Override
    public void borrowBook(Book book) {
        // TODO Auto-generated method stub
        System.out.println(getName() + " issued " + book.getTitle());

    }

    public void addBook(Book book) {
        System.out.println(getName() + " added " + book.getTitle());
    }
}

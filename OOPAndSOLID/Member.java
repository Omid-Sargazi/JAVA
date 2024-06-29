package OOPAndSOLID;

public class Member extends User {
    public Member(String name, String id) {
        super(name, id);
    }

    @Override
    public void borrowBook(Book book) {
        // TODO Auto-generated method stub
        System.out.println(getName() + " borrowed " + book.getTitle());

    }
}

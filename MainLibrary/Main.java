package MainLibrary;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Librarian librarian = new Librarian("Omid", "20605");

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        librarian.addBook(library, book1);
        librarian.addBook(library, book2);

        System.out.println("Books in library:");
        library.displayBooks();

        Member member = new Member("Saeed Sargazi", "1702");

        member.borrowBook(library, book1);

        System.out.println("\nBooks in library after borrowing:");
        library.displayBooks();

        member.returnBook(library, book1);

        System.out.println("\nBooks in library after returning:");
        library.displayBooks();

    }
}

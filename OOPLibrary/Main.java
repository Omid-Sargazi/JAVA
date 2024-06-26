package OOPLibrary;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        UserManager userManager = new UserManager();

        Librarian librarian = new Librarian("librarian", "lib123");
        userManager.registerUser(librarian);

        Member member1 = new Member("john_doe", "password123");
        Member member2 = new Member("jane_doe", "password456");

        userManager.registerUser(member1);
        userManager.registerUser(member2);

        librarian.addBook(new Book("Book One", "Author One", "ISBN001"), library);
        librarian.addBook(new Book("Book Tow", "Author Two", "ISBN002"), library);

        member1.borrowBook(library.findBookByTitle("Book One"));

        System.out.println(member1.getUsername() + " has borrowed " + member1.getNumberOfBorrowedBooks() + " book(s).");

        member1.returnBook(library.findBookByTitle("Book One"));

        // Login and Logout
        member1.login("john_doe", "password123");
        member1.logout();

        System.out.println("Is john_doe a member? " + userManager.isUserMember("john_doe"));
        System.out.println("Is jane_doe a member? " + userManager.isUserMember("jane_doe"));
        System.out.println("Is unknown_user a member? " + userManager.isUserMember("unknown_user"));

        System.out.println("Library system");
    }
}

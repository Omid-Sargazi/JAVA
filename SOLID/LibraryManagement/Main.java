package SOLID.LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell"));
        System.out.println("Total Books: " + library.getTotalBooks());

        System.out.println("Library");
    }
}

package Library003;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Read data from files
        readBooksFromFile(library, "books.txt");
        readMembersFromFile(library, "members.txt");

        // Add a new book
        Book newBook = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook(newBook);

        // Register a new member
        Member newMember = new Member("John Doe");
        library.registerMember(newMember);

        // Lend a book to the member
        try {
            Book bookToLend = library.getBooks().get(0);
            Member memberToLendTo = library.getMembers().get(0);
            library.lendBook(bookToLend, memberToLendTo);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cannot lend book, insufficient data.");
        }

        // Save data to files
        saveBooksToFile(library, "books_updated.txt");
        saveMembersToFile(library, "members_updated.txt");
    }

    // Read books data from file and add to library
    private static void readBooksFromFile(Library library, String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String title = parts[0];
                String author = parts[1];
                Book book = new Book(title, author);
                library.addBook(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read members data from file and add to library
    private static void readMembersFromFile(Library library, String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Member member = new Member(line);
                library.registerMember(member);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Save books data from library to file
    private static void saveBooksToFile(Library library, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            List<Book> books = library.getBooks();
            for (Book book : books) {
                writer.write(book.getTitle() + "," + book.getAuthor());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Save members data from library to file
    private static void saveMembersToFile(Library library, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            List<Member> members = library.getMembers();
            for (Member member : members) {
                writer.write(member.getName());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

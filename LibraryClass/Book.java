package LibraryClass;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book {
    private int bookID;
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private String publicationDate;
    private boolean isAvailable;
    private String coverImage;
    private String condition;
    private String location;
    private String barcode;
    private List<Review> reviews;
    private List<Rating> ratings;

    public Book(int bookID, String isbn, String title, String author, String genre, String publicationDate) {
        this.bookID = bookID;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationDate = publicationDate;
        this.isAvailable = true;
        this.reviews = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                " ,isbn=" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", isAvailable=" + isAvailable +
                ", coverImage='" + coverImage + '\'' +
                ", condition='" + condition + '\'' +
                ", location='" + location + '\'' +
                ", barcode='" + barcode + '\'' +
                '}';
    }

}

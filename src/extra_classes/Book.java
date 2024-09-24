package extra_classes;

public class Book {
    String isbn;
    int numberOfBooks;

    public Book(String isbn) {
        this.isbn = isbn;
        this.numberOfBooks = 0;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}

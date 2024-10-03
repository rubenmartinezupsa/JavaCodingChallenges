package extra_classes;

public class Book {
    String isbn;
    int numberOfBooks;

    public Book(String isbn) {
        this.isbn = isbn;
        this.numberOfBooks = 0;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return STR."Datos del libro: ISBN => \{isbn} || Numero de libros => \{numberOfBooks}";
    }
}

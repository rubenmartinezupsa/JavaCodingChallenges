import extra_classes.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej04 {
    static ArrayList<Book> bookList;
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        bookList = new ArrayList<>();
        System.out.print("Introduzca cuantos libros va a contener el catalogo de la libreria: ");
        int booksNumber = sc.nextInt();
        for (int i = 0; i < booksNumber; i++) {
            createBook();
        }
        System.out.println("=====================");
        for (int i = 0; i < bookList.size(); i++) {
            refillBook(bookList.get(i));
        }
        System.out.println("=====================");
        buyBook();
    }

    static public void createBook() {
        while (true)    {
            System.out.print("ISBN: ");
            String isbn = sc.next();
            if (bookList.contains(new Book(isbn)) || isbn.length() > 8) {
                System.out.println("Fallo al introducir la información del libro.");
            } else {
                System.out.println(STR."\{isbn} añadido correctamente.");
                bookList.add(new Book(isbn));
                break;
            }
        }
    }
    static public void refillBook(Book bk) {
        System.out.print(STR."Numero de ejemplares del libro con ISBN \{bk.getIsbn()}: ");
        int booksNumber = sc.nextInt();
        bk.setNumberOfBooks(booksNumber);
        System.out.println(STR."\{booksNumber} ejemplares anhadidos al libro con ISBN \{bk.getIsbn()}");
    }
    static public boolean getBook(String isbn) {
        return bookList.contains(new Book(isbn));
    }
    static public void buyBook() {
        System.out.println("=====================");
        System.out.print("ISBN a comprar: ");
        String searchedISBN = sc.next().trim();
        if (!getBook(searchedISBN)) {
            System.out.println("Libro no encontrado :(");
        }
        else {
            Book searchedBook = bookList.get(bookList.indexOf(new Book(searchedISBN)));
            if (searchedBook.getNumberOfBooks() <= 0)    {
                System.out.println("Lo sentimos. El libro seleccionado está agotado.");
            } else {
                System.out.print(STR."Introduzca la cantidad a adquirir (\{searchedBook.getNumberOfBooks()} ejemplares): ");
                int buyAmount = sc.nextInt();
                if (searchedBook.getNumberOfBooks() - buyAmount < 0)    {
                    System.out.println("No existen suficientes ejemplares para satisfacer la orden de compra");
                } else {
                    int oldnumBooks = searchedBook.getNumberOfBooks();
                    searchedBook.setNumberOfBooks(searchedBook.getNumberOfBooks() - buyAmount);
                    System.out.println("Felicidades. La orden de compra se ha ejecutado satisfactoriamente.");
                    System.out.println(STR."Ejemplares del libro \{searchedISBN}: \{oldnumBooks} => \{searchedBook.getNumberOfBooks()}");
                }
            }
        }
        Book searchedBook = bookList.get(bookList.indexOf(new Book(searchedISBN)) + 1);
        System.out.println(searchedBook);
    }
}

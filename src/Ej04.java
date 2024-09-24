import extra_classes.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        System.out.print("Introduzca cuantos libros va a contener el catalogo de la libreria: ");
        int booksNumber = sc.nextInt();
        for (int i = 0; i < booksNumber; i++) {
            createBook(sc, bookList);
        }
    }
    static public void createBook(Scanner sc, ArrayList<Book> bookList) {
        while (true)    {
            System.out.print("ISBN: ");
            String isbn = sc.next();
            if (bookList.contains(new Book(isbn)) || isbn.length() > 8) {
                System.out.println("Fallo al introducir la información del libro.");
            } else {
                System.out.println(STR."\{isbn} añadido correctamente.");
                bookList.add(new Book(isbn));
                System.out.println(STR."Libros en lista => \{bookList.size()}");
                break;
            }
        }
    }
}

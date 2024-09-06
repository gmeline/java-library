package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books; 

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        for (Book book : books) { 
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

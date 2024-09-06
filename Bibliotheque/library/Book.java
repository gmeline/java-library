package library;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("You borrowed the book: " + title);
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("You returned the book: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed;
    }
}

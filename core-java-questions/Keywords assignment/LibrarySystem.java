class LibraryBook {
    static String libraryName = "City Library";

    final String isbn;
    String title;
    String author;

    LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    String getISBN() {
        if (this instanceof LibraryBook) {
            return isbn;
        }
        return null;
    }

    void displayDetails() {
        if (this instanceof LibraryBook) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Programming", "Herbert Schildt", "ISBN101");
        LibraryBook b2 = new LibraryBook("Python Basics", "Guido van Rossum", "ISBN102");

        LibraryBook.displayLibraryName();

        b1.displayDetails();
        System.out.println("-----------------");
        b2.displayDetails();

        System.out.println("ISBN of first book: " + b1.getISBN());
    }
}

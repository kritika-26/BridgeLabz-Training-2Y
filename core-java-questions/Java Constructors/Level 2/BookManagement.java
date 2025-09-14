class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}

public class BookManagement {
    public static void main(String[] args) {
        Book b1 = new Book("123", "Java Basics", "James");
        System.out.println("Book -> ISBN: " + b1.ISBN + ", Title: " + b1.title + ", Author: " + b1.getAuthor());

        EBook eb1 = new EBook("456", "Advanced Java", "Herbert");
        eb1.display();
    }
}

import java.util.*;

public class Bookshelf {

    private ArrayList<Book> books;
    private int size;

    public Bookshelf() {

        this.books = new ArrayList<Book>(10);  // Init the ArrayList object
        this.size = 10;
    }

    public Bookshelf(int size) {

        this.books = new ArrayList<Book>(size);  // Init the ArrayList object
        this.size = size;
    }

    public void printBooks() {

        for (Book book : this.books) {

            book.printAllDetails();

        }

    }

    public void addBook(Book book) {

        if (this.books.size() < this.size) {

            this.books.add(book);  // Add it to the ArrayList

        }
        else {

            System.out.println("Unable to add the book '" + book.title + "'. Bookshelf is full!");

        }
    }

    public Book findBookWithIsbn(String isbn) {

        for (Book book : this.books) {

            if (book.getIsbn().equals(isbn)) {  // Is it the correct one?
                return book;  // Yes, return it
            }
        }

        // All elements of the ArrayList has been checked but the book is not found.
        // Just return null
        return null;

    }

}
public class TestBookshelf {

    public static void main(String[] args) {

	

        // Create a bookshelf with size 2
        Bookshelf bookshelf1 = new Bookshelf(3);

        // Create one TextBook and add it to the Bookshelf
        TextBook book1 = new TextBook("978-0596009205", "Head First Java", "Kathy Sierra and Bert Bates", "O'Reilly Media");
        bookshelf1.addBook(book1);

        // Create one Novel and add it to the Bookshelf
        Novel book2 = new Novel("978-0-385-53785-8", "Inferno", "Dan Brown", "English", "Mystery");
        bookshelf1.addBook(book2);

        // Create one Comic Book and add it to the Bookshelf
        ComicBook book3 = new ComicBook("978-2-86497-266-2", "Asterix and the Picts", "Jean-Yves Ferri, Rene Goscinny and Albert Uderzo", "Didier Conrad");
        bookshelf1.addBook(book3);

        // print all books
        System.out.println("Printing all books...");
        bookshelf1.printBooks();

    }
}

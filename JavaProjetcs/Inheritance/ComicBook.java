public class ComicBook extends Book {
    
    protected String illustrator;

    public ComicBook(String isbn, String title, String author, String illustrator) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.illustrator = illustrator;

    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return this.illustrator;
    }

    public void printIllustrator() {
        System.out.println("Illustrator: " + illustrator);
    }

    public String toString() {
        return ("'" + this.title + "' by " + this.author + ", illustrated by " + this.illustrator + ".");
    }

    public void printAllDetails()
    {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Illustrator: " + this.illustrator);
    }

}

public class Novel extends Book {
    
    protected String language;
    protected String genre;

    public Novel(String isbn, String title, String author, String language, String genre) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.language = language;
        this.genre = genre;

    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void printLanguage() {
        System.out.println("Language: " + language);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void printGenre() {
        System.out.println("Genre: " + genre);
    }

    public String toString() {
        return ("'" + this.title + "' by " + this.author + ", a " + this.genre + " novel.");
    }

    public void printAllDetails()
    {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Language: " + this.language);
        System.out.println("Genre: " + this.genre);
    }
}

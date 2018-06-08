public abstract class Book {
    
    protected String title;
    protected String author;
    protected String isbn;
    protected String description;

    public void setTitle(String title) {
        this.title = title;
    }


    public String getTitle() {
        return this.title;
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void printAuthor() {
        System.out.println("Author: " + author);
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void printIsbn() {
        System.out.println("ISBN: " + isbn);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void printDescription() {
        System.out.println("Description: " + description);
    }

    public abstract void printAllDetails();

}

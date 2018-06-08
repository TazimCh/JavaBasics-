public class Book {
    
    private String title;
    private String author;
    private String isbn;
    private String description; 
    private boolean bookAvailable=true;

    public void printTitle() {
        System.out.println("Title: " + title);
    }

    public  void printAuthor() {
        System.out.println("Author: " + author);
    }

    public  void printIsbn() {
        System.out.println("ISBN: " + isbn);
    }

   
    
     public  void printDescription() {
        System.out.println("Description: " + description);
    }
	public void setTitle(String t) {

	  title = t;

	}

	public String getTitle() {

	   return title;

	}

	
	public void setAuthor(String a){

	  author = a;

	}

	public String getAuthor() {

	   return author;

	}

	public void rentBook(){
	
	if (bookAvailable == true){
		System.out.println("You take the book");
		 bookAvailable = false;
	}else{
		System.out.println("The book" + title +" by "+author +" is notavailable.");	 		  
	}
	
	}

	public void returnBook (){
	

	if (bookAvailable== false) {
		System.out.println("Thanks");
		bookAvailable=true;
	}else{
		System.out.println("You don't have the book");	
	}
	
	}
	
	public  String toString() {
        return ("'" + title + "' by " + author);
    }
  




}

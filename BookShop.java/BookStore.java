public class BookStore {

	public static void main (String args[]) {
	
	Book myBook1= new Book (); // new object or intance 
	Book myBook2= new Book ();

	
	
	myBook1.setTitle ("Head first java"); 
	System.out.println(myBook1.getTitle());
	myBook2.setTitle ("Java, How to Program");
	System.out.println(myBook2.getTitle());

	myBook1.setAuthor("Kathy Sierra and Bert Bates"); 
	System.out.println(myBook1.getAuthor());
	myBook2.setAuthor("Kathy Sierra and Bert Bates"); 
	System.out.println(myBook2.getAuthor());


	myBook1.rentBook();
	myBook1.returnBook ();
	myBook2.rentBook();
	myBook2.returnBook ();
	
	System.out.println(myBook1); //It calls toString method  

	}
}

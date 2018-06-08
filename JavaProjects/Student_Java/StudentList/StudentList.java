
import java.util.ArrayList;


public class StudentList {

	private ArrayList<Student> list; //instance variable

	
	public StudentList(){
		list = new ArrayList<Student>();
	}
	

	
	public void printList(){
		System.out.println("--Begin--");
		
		for (int i = 0; i < list.size(); i++) {

           
        	    System.out.println(list.get(i));
 	       }

		System.out.println("--End--");
	}
	
	
	public void addToList(Student s){
		
		
		list.add(s);
		
		//System.out.println(s + " has been added to the student list");
	}

	
	public void removeFromList(Student s){
		
	
		list.remove( s);
	}
	
	
	public static void main(String[] args) {

		// Create an instance of the class 
		StudentList studentList = new StudentList();

		//create 3 student objects
		Student s1 = new Student("John Smith", "js@qmul.ac.uk", 2008);
		Student s2 = new Student("Tom Will", "tw@qmul.ac.uk", 2007);
		Student s3 = new Student("Alan Smith","Alan@gmail.co.uk",2006);
		

		

		//add the three students to the list
		studentList.addToList(s1);
		System.out.println(s1.getName()+ " has been added to the student list");
		studentList.addToList(s2);
		System.out.println(s2.getName()+ " has been added to the student list");
		studentList.addToList(s3);
		System.out.println(s3.getName()+ " has been added to the student list");
		
		// Print the list
		studentList.printList();
			
		// Remove the student "Tom Will"
		studentList.removeFromList(s2);
		System.out.println(s2.getName()+ " has been removed from the student list");		


		// Print the list again
		studentList.printList();
	}

}

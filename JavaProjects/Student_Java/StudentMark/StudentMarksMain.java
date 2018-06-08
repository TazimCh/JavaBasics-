import  java.util.Scanner;

public class StudentMarksMain{
		
	public static void main(String[] args ){
		
		Scanner Input = new Scanner(System.in); 
		StudentMarks m = new StudentMarks();

		for(int i= 0; i<7;i++){

			System.out.print("Input the mark number at position " + i + " : ");

			double num = Input.nextDouble();
			
			m.setMark(i,num); 

			}

	
			System.out.println("The mean mark is  " + m.Mean());

		//	System.out.println("The highest mark position is " + m.IndexHigh());


			System.out.println("The highest mark position is " + m.ReverseIndex());
		
		}






	}

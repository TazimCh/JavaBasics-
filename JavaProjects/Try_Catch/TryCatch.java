
import java.io.*;
import java.util.*;

public class TryCatch{
	
	public static void main (String args[]){
		
		Scanner reader = new Scanner(System.in);
		System.out.println ("Enter the number of integers" );
		
		boolean done = true; 
		
		do{

			try{

				int s = reader.nextInt();
		
				int[] anArray = new int[s];
				int sum = 0;
				for(int i=0; i< anArray.length; i++ ){
				
				

					System.out.println("enter the number at array position " +i+ ":" );

					int n = reader.nextInt();
					anArray[i]=n;
					sum = sum + anArray[i];
						 
					}

	 			double avarage = (double)sum/s;
				System.out.println ("avarage is " + avarage);
				done = false; 
				}
				catch(Exception e){
			
				System.out.println("The value must be positive");
			
				}

			}while (done == true);

		
	}


}


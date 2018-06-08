import  java.util.Scanner;

public class MagicNumberGame{


	public static void main (String args[] ){

		MagicNumber object = new MagicNumber();
		Scanner entry = new Scanner(System.in);

		int NumMag = object.RandNum();			
		int tries =0;	 
			do{	
				System.out.println ("Guess a integer number between 1 to 100" );


				while (entry.hasNextInt() == false){   // it checks if it is a letter or integer
					 
					System.out.println ("Please enter an integer" );
					tries++; 
					  entry.next();
					}
 
		int input = entry.nextInt();

				while (object.CheckNumber(input)== false){   // it checks if the input is between the range

					System.out.println ("Please enter an integer from 0 to 100" );
					tries++; 	
					if (object.CheckNumber (entry.nextInt())== true)
								break;				
					}
		
		object.logic (input, NumMag);   // the main instruction of the programme 
		tries++; 
		if (input == NumMag) break;
 		
			} while (true);

	System.out.println("Number of tries: "+tries);

	}
}

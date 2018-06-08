import	java.util.Random;
//import  java.util.Scanner;


public class MagicNumber{

	public int RandNum(){

		Random rand = new Random (); 

		int num = rand.nextInt(100);
 		System.out.println ("the secret number is : "+ num);
		return num; 
	} 


	public  boolean CheckNumber(int l){			

		if(l>0 && l<101){

			//System.out.println("the number meets the requirement");
			return true;
			} else{
				
				return false;
				} 

	}

	
	public boolean logic(int value, int num){

		if (value == num){
			      System.out.println("Well done");
				return true;
				
			}else if (value < num){
				
				System.out.println("too small");
				return false;
				

			}else if(value > num) { 
				System.out.println("too large");
				return false;
				
				}else {

				System.out.println("Something went wrong");
				return false;
									
					}


	}


     









}

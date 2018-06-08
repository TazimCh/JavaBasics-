

public class StudentMarks{
		
		private double Mark;
		
		private double maxMark=0;

       		double[] MyArray = new double[7];

		public double getMark(int pos){
			
			return Mark; 
		    
			}

		public void setMark(int pos, double mark){

			MyArray[pos]= mark;

			}		
		 
		public double Mean(){

		double sum = 0;
		 
		for (int i=0; i<MyArray.length; i++){
			   
			sum = sum + MyArray[i];        		 
            		 
       			 }
			double mean = sum/7; 
		
			return mean; 
		
			}


		public int IndexHigh(){
			
		 int Index = 0;
		 for (int i=0; i<MyArray.length; i++){
			           		 
            		if (maxMark< MyArray[i]){
			
			maxMark = MyArray[i];
			Index = i; 
				}
            		           
       			 }
			return Index; 

			}
		
		public int ReverseIndex(){

		 int Index = 0;

		 for (int i=6; i>0; i--){
			           		 
            		if (maxMark < MyArray[i]){
			
			maxMark = MyArray[i];
			Index = i; 
				}
            		           
       			 }
			return Index; 

			



		}



	}

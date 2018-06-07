/**
 * This is a class 
 * @author Tazim
 * @version 2.3 
 */
public class Counter {
	
	private int count; 
	private int max; 
	

	public Counter(){ 

		count = 0;
		max = 10; 

	}


	public void setCount(int n){    // this methos has a paremeter 
		if (n>=max){
			System.out.println("the count is bigger than the max of"+ max);
		}else{
		count=n;}

	}
	
	public int getCount(){

		return count; 
	}


	public void setMax(int m){
	
		max=m;

	}
	
	public int getMax(){

		return max; 
	}
	
	public void increase(){ 
	
		if(count >= max){
  		
		reset();
		
		}else{
			count= count +1; 
			}		
	}
	
	public void increase(int n){ // method takes a parameter .... method overloading

		for (int i=0; i<n; i++){
			increase(); 
			}

	}	

	public void decrease(){

		if (count <= 0){
			System.out.println("the count is equal to 0, no further decrease");
		}else{
			count = count -1;
		}
	
	}

	public void decrease(int n){

		for (int i=0; i<n; i++){
			decrease(); 
		}



	}




	public void reset (){

		count = 0;
	System.out.println ("Counter Reset!!");
	}


	public String toString(){ // returns as string values of count and max

	
	return "Counter: " + this.count + " and Max: " + this.max;
	}


}

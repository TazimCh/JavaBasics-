/**
 * This is the test class to test Counter 
 * @author Tazim
 *
 */
public class CounterTest{
	
	public static void main (String []args){

	Counter classe = new Counter(); // creating an object from the class Counter 



//	it is possible to call different function using callers
	classe.setCount(9);// it needs an argument
	classe.decrease(1);
	System.out.println(classe.getCount());
	
	classe.increase(1);
	System.out.println(classe.getCount());
	System.out.println(classe.toString());




	}


}

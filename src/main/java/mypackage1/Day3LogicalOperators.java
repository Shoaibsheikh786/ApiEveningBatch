package mypackage1;

public class Day3LogicalOperators {

	public static void main(String[] args) {
     
		// && applied on boolean values
//in && operator ,if one operand is false , output will be false	
		System.out.println(true && true );
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("****************************");
	   
		
		//OR -> even only one operand is true --> true
		System.out.println(true || true ); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false);//false
		
		//!-> it convert true to fasle 
		// and false to true
		
		System.out.println("****************************");
		System.out.println(!true); //! inverse of true
		System.out.println(!false); //! inverse of false
		
		


	
		
		
		
		
	}

}

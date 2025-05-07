package mypackage1;

public class Day3DecesionMakingIfAndElse {

	public static void main(String[] args) {
   
	//IF - ELSE
		/* if(condition)
		 * {
		 *   .. code 
		 * }
		 * else 
		 * {
		   code...
		   }*/
		
	// number either even or odd
		
		int age=25;
		
		if(age>18)
		{
			System.out.println("you are eligible to vote");
		}
		else
		{
			System.out.println("you are not eligible to vote");
		}
		
		//even or odd
		// number % 2 ==0 --> even , odd
		
		int number=11;
		if(number%2==0)
		{
			System.out.println("Number is even");
		}
		else 
		{
			System.out.println("Number is odd");
		}
		
		
		
		   
	}

}

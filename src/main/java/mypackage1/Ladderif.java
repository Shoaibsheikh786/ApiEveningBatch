package mypackage1;

public class Ladderif {

	public static void main(String[] args) {
     
		int a=10;
		int b=10; 
		
		//1 . a > b , 2. b > a,  c. a==b
		
		//else if 
		
		if(a>b)
		{
			System.out.println("A is Greater Than B");
		}
		else if(a==b)
		{
			System.out.println("A and B are Equal");
		}
		else 
		{
			System.out.println("B is Greater Than A");
		}
	}

}

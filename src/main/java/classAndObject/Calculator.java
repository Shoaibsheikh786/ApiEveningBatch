package classAndObject;

public class Calculator {
  
	int add()   //can we change void , 
	{                     //c --> int
		int a=10;
		int b=20;
		int c=a+b;
		
		//when i add these two number 
		//i want to return the value of c 
		//System.out.println(c);
		
		return c;
	}
	
	float div()
	{
		float a =100;
		float b=20;
		float c=a/b;
		
		return c;
	}
	// create a method -> multiplication
	// create a methods -> retun String 
	// method-> static , non -static 
	//non-static, create object -> call();
	// static, directly call it 
	
	
	public static void main(String[] args) {
		Calculator o1=new Calculator();
		//System.out.println(c);
		int c=o1.add();
		System.out.println(c);
		
		float z= o1.div();
		System.out.println(z);
		
	}
}

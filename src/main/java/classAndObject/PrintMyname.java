package classAndObject;

public class PrintMyname {
  
	
static	void printMyBatchDetails()   //static method
	{
		System.out.println("Batch Details");
		System.out.println("Student1 ");
		System.out.println("Student2 ");
		System.out.println("Student3 ");
		
	}

  void printMyName()   //non - static method
  {
	  System.out.println("SHOAIB ");
  }
	
	public static void main(String[] args) {
		
		//print batch details 
		printMyBatchDetails();
		
		//other code
		System.out.println("THis is java *****");
		System.out.println("****THis is selenium ");
		
		//print batch details again
		
		printMyBatchDetails(); //calling a static method
		
		System.out.println("*****************************");
		//printMyName()
		
		//How to call a non static method
		//1. Create object of a class
		 PrintMyname o1=new  PrintMyname();
		//2. By using ref Variable -> o1
		 o1.printMyName();
	

	}

  
}

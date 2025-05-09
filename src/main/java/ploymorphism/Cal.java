package ploymorphism;

public class Cal {
	
	//one entity multiple forms
	//method overloading 
	//method name same, parameters will be different 
	void add(int a,int b)
	{ 
		int c=a+b;
		System.out.println("Addition "+c);
	}
	
	void add(String s1,String s2)
	{
		System.out.println("Concationation "+s1+s2);
	}

	public static void main(String[] args) {
		
		Cal o1=new Cal();
		o1.add(12, 100);
		o1.add("hello ","world");
		
		//depends what we are passing 
		//parameters 
  
	}

}

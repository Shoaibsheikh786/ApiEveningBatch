package inheritance;

import encapsulation.User;

public class Calculator {
	
	int a;
	int b;
	void add(int x, int y)
	{
		System.out.println(x+y);
	}
	void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	
	//div--> float 
	//mult-> 
	
	
  public static void main(String[] args) {
	  Calculator c1=new Calculator();
	  //add
	  //sub
	  //differnt package , 
	  //User is in Enncapsulation package
	  //Calculator is in inheritance package
	  User u1=new User();
	  
	  System.out.println(u1.password);
}

}

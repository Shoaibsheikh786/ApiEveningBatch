package inheritance;

public class AdvancedCalculator extends Calculator {
	
	// add sub , ... ...
	// power , sin
	

	//... 
	//...
	void pow(int x,int y)
	{
		System.out.println("Power method ");
		//access some variable , protect.. we can access
		//def and protected 
	}
	
	public static void main(String[] args) {
		AdvancedCalculator  o1=new AdvancedCalculator();
		o1.add(100, 20); //valid -> extends 
		o1.sub(30, 21);
		o1.pow(20, 12);
	}

}

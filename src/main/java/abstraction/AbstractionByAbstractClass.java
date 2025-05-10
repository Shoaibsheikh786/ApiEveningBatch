package abstraction;

abstract class ABC
{
	// abstract methods();
	//non - abstract methods -> methods with code
	
	abstract void credit();
	void add()
	{
		System.out.println("helo");
	}
	//private  public

	//0 to 100% abstraction
	
	//2 -> 50%,  10 --> 3 methd 
	
}

public class AbstractionByAbstractClass extends ABC{
	
	public static void main(String[] args) {
		
		//can we create an object of an abstract class
		//NO, interface -> NO
		
		
		
		
	}

	@Override
	void credit() {
		// TODO Auto-generated method stub
		
	}

}

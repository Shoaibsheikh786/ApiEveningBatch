package abstraction;
//1. interface
//2. abstract class

interface RBI
{
	//abstract methods: without logic/without code/ imple
	
abstract public	void credit();  //no code; abstract 
abstract public	void debit();  //we

//we cant have private methods -> public ,abstract



//100% abstraction 
}

class PNB  implements RBI
{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}
 	
}

//class --->    class ==> extends
//interface --> class ==> implements 

public class SBI implements RBI {

	@Override
	public void credit() {
		  System.out.println("This is credit logic SBI");
	}

	@Override
	public void debit() {
		System.out.println("This is debit logic SBI");
		
	}
	
	public static void main(String[] args) {
		SBI o1=new SBI();
		o1.credit();
		o1.debit();
		
		//we cant create an object of an interceface
	
	}



}

package abstraction;

public class StaticIm {
	
	static String getUrl="https://www.uat.facebook.com";
	static String postUrl="https://www.pre.youtube.com";
	
private	String password="abcPasswrod";
	public static void main(String[] args) {
		
		//access static variables
		//className.sataticVariable
		System.out.println(StaticIm.getUrl);
		System.out.println(StaticIm.postUrl);
		
		//access non-static 
		//1. create an object 
		//classname ref=new classname();
		
		StaticIm o1=new StaticIm();
		System.out.println(o1.password);
		
		//here you can access private 
		//private variable is defined in the same class
  
	}

}

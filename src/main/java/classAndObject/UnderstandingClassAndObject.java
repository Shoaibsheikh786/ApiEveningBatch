package classAndObject;


class Student
{
	String name;
	String email;
	boolean isMarried;
}

public class UnderstandingClassAndObject {
	
	public static void main(String[] args) {
		// Student --> 
		// name="muneer", "muneer@abc.com", false
		
		Student s1=new Student();
		s1.name="Muneer";
		s1.email="muneer123@gmail.com";
		s1.isMarried=false;
		
		Student s2=new Student();
		s2.name="shaoib";
		s2.email="shaoib@gmail.com";
		s2.isMarried=true;
		
	  //To print the data ,
		// Sysout
		
		System.out.println(s1.name);
		System.out.println(s1.email);
		System.out.println(s1.isMarried);
	
		System.out.println("***********************");
		
		System.out.println(s2.name);
		System.out.println(s2.email);
		System.out.println(s2.isMarried);
	}

}

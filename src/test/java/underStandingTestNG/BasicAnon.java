package underStandingTestNG;

import org.testng.annotations.Test;

public class BasicAnon {

	
	//1. To add TestNG Libaray 
	  //url: https://mvnrepository.com/
	  //serach for testNG (OR) copy my pom.xml file (dependenciess )
	  //add testNG to pom.xml
	//################################33
	//2. Add TestNG plugin
	  //help -> eclipse marketplace--> testNG, install,->next
	//3. create you package and classes in 
	    //->>>> 
     	/***src/test/java
     	 *  -> package
     	 *     -> class*/
	
	// How to execute your test
	//1. click on run all
	//2.-> create one xml file 
	   //right click on the selected classes
	     //how to selecte-> cntrl + click on the class, 
	   //serach for TestNG
	   //-> convert to testNg
	   //-> automatically create an xml file 
	@Test
	public void myTest1()
	{
		System.out.println("hello world");
	}
	
	@Test
	public void myTest2()
	{
		System.out.println("This is second test");
	}

}

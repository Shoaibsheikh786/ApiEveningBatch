package underStandingTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Otherannonations {
	
//	@BeforeTest      @AfterTest
//	public void befTes()
//	{
//		System.out.println("This is pre-requist");
//	}
	
	@BeforeMethod           //afterMethods
	public void befMethod()
	{
		System.out.println("####This is pre-requist");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Create the data first ");
		System.out.println("Hell Test 1");
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("Create the data first ");
		System.out.println("Hell Test 2");
		
	}
	@Test
	public void test3()
	{
		System.out.println("Create the data first ");
		System.out.print("Hell Test 3");
		
	}
	@AfterMethod
	public void af()
	{
		System.out.println("***_After Completion this code will be executed");
	}

	//@BefroeTest: once once before test gets started
	//@BeforeMethod: each time when a test gets executed 
}

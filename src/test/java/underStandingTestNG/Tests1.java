package underStandingTestNG;

import org.testng.annotations.Test;

public class Tests1 {
	
	//ALphabetical order
	// testxyz, testabc
	//-> testabc, testxyz
	
	
	//Can we change the order 
	//-> attribute (prioprity)
	
	@Test(priority=1)
	public void testxyz()
	{
		System.out.println("TEST XYZ ");
	}
	
	@Test(priority=2)
	public void testabc()
	{
		System.out.println("TEST ABC");
	}

}

package apiChaining;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ReadUser {
	
	
	@Test()
	public void readUser(ITestContext con)
	{   
		Object id=con.getAttribute("id");
		
		RestAssured.given()
		.when()
		.get("https://reqres.in/api/users/"+id)
		.then();
	}

}

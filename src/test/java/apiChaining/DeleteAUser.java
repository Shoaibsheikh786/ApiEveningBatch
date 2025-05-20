package apiChaining;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteAUser {
	@Test(priority=3)
	   public void deleteUser(ITestContext con)
	   {  
		 Object id= con.getAttribute("id");
			RestAssured.given()
			.when()
			.delete("https://reqres.in/api/users/"+id)
			.then();
	   }

}

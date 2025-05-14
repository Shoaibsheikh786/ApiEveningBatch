package validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ValidataionBodyJso {
	
	@Test
	public void getStudents()
	{

		
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.when()
		 .get("https://reqres.in/api/users?page=2")
		.then().body("data[1].id",Matchers.equalTo(8));
	}

}

package test;

import org.testng.annotations.Test;

import endPoints.UserEndpoints;
import io.restassured.RestAssured;

public class UserTest {
	
	@Test
	public void userTest()
	{
		RestAssured.given()
		.when()
		.get(UserEndpoints.getStudent)
		.then().log().body();
	}

}

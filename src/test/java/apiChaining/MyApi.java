package apiChaining;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class MyApi {
	
	@Test
	public void getStudent()
	{
		RestAssured.given()
		.when()
		.get("http://localhost:3000/users")
		.then().log().body();
	}
	@Test
	public void creatAuser()
	{
		HashMap<String,String> data=new HashMap<>();
		data.put("name", "Kiran");
		data.put("email", "kiran@gmail.com");
		
		RestAssured.given()
		.body(data)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:3000/users")
		.then().log().body();
			
	}
	
	@Test
	public void readASpecificUser()
	{
		RestAssured.given()
		.when()
		.get("http://localhost:3000/users/46")
		.then().log().body();
		
		
	}

}

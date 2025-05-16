package authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Authentication {
	
	
	@Test
	public void basicAuth()
	{  
		
		//1. authntication 
		//2. -> username and password
		RestAssured.given()
		.auth().basic("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then().log().body();
	}
	
	@Test
	public void digestAuth()
	{  
		
		//1. authntication 
		//2. -> username and password
		RestAssured.given()
		.auth().digest("postman", "password")
		.when()
		.get("https://postman-echo.com/digest-auth")
		.then().log().body();
	}
	
	@Test
	public void preemptiveAuth()
	{  
		
		//1. authntication 
		//2. -> username and password
		RestAssured.given()
		.auth().preemptive().basic("postman", "password")
		.when()
		.get("https://postman-echo.com/digest-auth")
		.then().log().body();
	}
	
	@Test
	public void bearerToken()
	{
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.when()
		 .get("https://reqres.in/api/users?page=2")
		 .then().log().body();
	}


}

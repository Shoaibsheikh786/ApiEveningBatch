package payload;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PayloadJsonObject {
	
	@Test
	public void createUser()
	{
		/*
		 * {
           "name": "morpheus",
           "job": "leader"
            }
		 * */
		//How to store the data 
		//1. JSONObject -> class 
		JSONObject data=new JSONObject();
		data.put("name","jhon" );
		data.put("job", "Automation Tester");
		 
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data.toString())   //convert --> toString()
		.contentType(ContentType.JSON)
		.when()
		.post("https://reqres.in/api/users")
		.then().log().body();
		
		
	}

}

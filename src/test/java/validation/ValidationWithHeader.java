package validation;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ValidationWithHeader {
	
	@Test
	public void validataionHeader()
	{
		//Content-Type   :   application/json; charset=utf-8
		HashMap<String,String> data=new HashMap<>();
		data.put("name", "muneer");
		data.put("job", "SDET");
		
		//payload --> data
		 //type of data ContentType.JSON
		
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data)
		.contentType(ContentType.JSON)
		.when()
		.put("https://reqres.in/api/users/2")
		.then().header("Content-Type", "application/json; charset=utf-8");
		
	}

}

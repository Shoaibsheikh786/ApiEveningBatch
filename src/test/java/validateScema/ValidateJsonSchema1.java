package validateScema;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class ValidateJsonSchema1 {
	
	@Test
	public void validateJsonSchema()
	{
	Response res=	RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.when()
		.get("https://reqres.in/api/users/2");
	
	//  res.then().statusCode(0);
	//  res.then().body(null, null)
	
//	validatejson
	 //1. We need to have json schema
	//2.
	res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("myschema.json"));
	}

}

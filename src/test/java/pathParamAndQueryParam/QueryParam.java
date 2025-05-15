package pathParamAndQueryParam;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class QueryParam {
	
	@Test
	public void dealingWithQueryParam()
	{
		
	
		RestAssured
		.given()
		.queryParam("page",2)
		.header("x-api-key","reqres-free-v1")
		.when()
		 .get("https://reqres.in/api/users") //? page = 2
		.then().log().body();
	}

}

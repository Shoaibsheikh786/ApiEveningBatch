package multipleValidations;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AllValidations {
	
	@Test
	public void allValidationInOnRequestin()
	{
		HashMap<String,String> data=new HashMap<>();
		data.put("name", "muneer");
		data.put("job", "SDET");
		
		//1. We need to store the Response
		//2. Don't write then() method
		   //-> store it in Response ref;
		
		Response res=RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data)
		.contentType(ContentType.JSON)
		.when()
		.put("https://reqres.in/api/users/2");
		
		//.then().time(Matchers.lessThan(4l),TimeUnit.SECONDS);
	
	  //res-> Response -> Cookie, header, body,statuscode
		res.then().time(Matchers.lessThan(4l),TimeUnit.SECONDS);
		res.then().statusCode(200);
	//	res.then().body("job", "value of job")
	//	res.then().header(null, null)
	//  res.then().body("name", ...);
	}

}

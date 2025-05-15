package pathParamAndQueryParam;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PathParam {
	
	@Test
	public void pathParam()
	{
		HashMap<String,String> data=new HashMap<>();
		//2. how to store the data , put(k,v)
		 data.put("name", "jack");
		 data.put("job", "Devops");
		
	
		String ck="users";
		RestAssured
		.given()
		.pathParam("name", ck)
		.header("x-api-key","reqres-free-v1")
		.body(data)
		.contentType(ContentType.JSON)
		.when()
		.post("https://reqres.in/api/{name}")
		.then().log().all();
	}

}

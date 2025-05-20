package apiChaining;

import java.util.HashMap;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateAuser {
	
	@Test
	public void updateStudent(ITestContext con)
	{
		/*{
    "name": "morpheus",
    "job": "zion resident"
}*/  
		
		Object id=con.getAttribute("id");
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
		.put("https://reqres.in/api/users/"+id)
		.then().statusCode(200);
	}

}

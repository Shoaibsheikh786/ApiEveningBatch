package payload;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POJOclass {
	

	@Test
	public void addStudent() {
	//1hashX
    //2JsonOx
		//1. create a class 
		//2. in the class define the variables
		//3. generate/write getter/setter methods 
		//4. create an object of that 
		//5. store data in the class
		//5. we can use object as body
		User data=new User();
		data.setName("jhon");
		data.setJob("developer");
//		data.name="jshon";
//		data.job="jsjs";

		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data)   
		.contentType(ContentType.JSON)
		.when()
		.post("https://reqres.in/api/users")
		.then().log().body();
		
	}

}

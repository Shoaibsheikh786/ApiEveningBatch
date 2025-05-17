package fakerlib;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RequestiWithFakerLib {
	
	@Test
	public void test1()
	{
		HashMap<String,String> data=new HashMap<>();
		//2. how to store the data , put(k,v)
		 Faker f1=new Faker();

		
		data.put("name",f1.name().firstName() );
		data.put("job",f1.job().position() );
		
	
		 
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

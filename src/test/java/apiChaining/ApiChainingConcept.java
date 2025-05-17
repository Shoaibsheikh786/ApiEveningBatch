package apiChaining;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ApiChainingConcept {

	//1. create a post 
	// -> need some data
	// read the same output by extracting the id
	//then we will use that id in payload 
	//to update the payload
	//the same id , del
	
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
		//1. HashMap<keysDT,valuesDT> ref=new HashMap<>();
		HashMap<String,String> data=new HashMap<>();
		//2. how to store the data , put(k,v)
		 data.put("name", "jack");
		 data.put("job", "Devops");
		
	
		 
	Response res=	RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data)
		.contentType(ContentType.JSON)
		.when()
		.post("https://reqres.in/api/users");
	
	    JsonPath jp=res.jsonPath();
	    int i1=jp.getInt("id");
	    
	    System.out.println("ID "+i1);
		
		
	}
}

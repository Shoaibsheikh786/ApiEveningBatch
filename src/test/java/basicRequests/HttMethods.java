package basicRequests;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class HttMethods {
	
	//1. Rest Assured Lib
	
	//get request
	@Test
	public void getStudents()
	{
		//1.given() when() then()
		
		/*RestAssured.
		 * given()
		 *   //authentication, payload,(data), 
		 *   
		 * .when()
		 *  //Type of request:-> get, post , put , del,patch
		 *     
		 *  
		 * .then()
		 *  //log the repsonse
		 *   //validate the test 
		 *    //status code
		 *    //response body
		 *    //header 
		 *    //cookies 
		 *    //time
		 *;
		 * 
		 * */
		//log the response 
		//then()
		  //log().[all(), .body(),.cookies(),.header()];
		
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.when()
		 .get("https://reqres.in/api/users?page=2")
		.then().statusCode(200);
	}
	
	//post request
	
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
		
	
		 
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data)
		.contentType(ContentType.JSON)
		.when()
		.post("https://reqres.in/api/users")
		.then().statusCode(201);
		
		
	}
	
	//3. update record
	// -> put(payload)
	 //payload-> HashMap
	
	@Test
	public void updateStudent()
	{
		/*{
    "name": "morpheus",
    "job": "zion resident"
}*/  
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
		.then().statusCode(200);
	}
	
	//patch 
    @Test
    public void updateNameOnly()
    {  
    	//Payload 
    	//1. HashMap
    	HashMap<String,String> data=new HashMap<>();
    	data.put("name", "new Name");
    	data.put("job", "Tester");
    	
    	RestAssured.given()
    	.header("x-api-key","reqres-free-v1")
    	.body(data)
    	.contentType(ContentType.JSON)
    	.when()
    	.patch("https://reqres.in/api/users/2")
    	.then().statusCode(200);
    }
	
	//delete request
	@Test
	public void deleteSudent()
	{
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.when()
		 .delete("https://reqres.in/api/users/2")
		.then().statusCode(204);
	}
	
	
	
	
	
	

}

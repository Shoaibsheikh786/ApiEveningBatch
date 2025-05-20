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
	int id;
	@Test(priority=1)
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
	    id=jp.getInt("id");
	    
	    System.out.println("ID "+id);
		
		
	}
	
	@Test(priority=2)
	public void readUser()
	{
		RestAssured.given()
		.when()
		.get("https://reqres.in/api/users/"+id)
		.then();
	}
	
	@Test(priority=3)
   public void deleteUser()
   {
		RestAssured.given()
		.when()
		.delete("https://reqres.in/api/users/"+id)
		.then();
		
		
		//1.Downlod node js
		 //--> nodejs downlaod
		//2.Cmd type node
		 //npm install json-server
		
		//3. Run 
		//json server filename.json
   }
}



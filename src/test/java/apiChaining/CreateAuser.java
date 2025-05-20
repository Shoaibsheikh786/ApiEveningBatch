package apiChaining;

import java.util.HashMap;

import org.testng.ITestContext;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateAuser {
	int id;
	public void createUser(ITestContext con)
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
	    
	    con.setAttribute("id", id);
	    
	    
		
		
	}

}

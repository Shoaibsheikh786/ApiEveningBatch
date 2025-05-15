package dealingWithHeadersAndCookies;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class DealingWithHeaders {
	
	@Test
	public void dealWithHeaders()
	{
		Response res=RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.when()
		 .get("https://reqres.in/api/users?page=2");
		
	
		String str=res.header("Content-Type");
		System.out.println(str);
		
		//We want to check any header
		// res.header(headerKey); 
		
		//How to Print all the headers
		 //repeat an action --> loops (for loop)
		
		Headers hd=res.headers();
		
		//i want to repeat some code 
		for(Header h:hd)
		{
			System.out.println(h.getName()+" --> "+h.getValue());
			//if the header is present of not 
			//Contenet-Type:
			   //h.getName() Store in string
			  //if(string.equlsTo(...)) -> Sysout(Presetn);
		}
		
		
		//What is the value of a header -> Content-Type:
		//header("Content-Type") 
		
		
		
	}

}

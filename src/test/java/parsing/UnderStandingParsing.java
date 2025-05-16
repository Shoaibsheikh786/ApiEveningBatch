package parsing;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
      //static                          //.*

public class UnderStandingParsing {
	
	@Test
	public void getAllStudentsDetails()
	{
	Response res=	given()
		.header("x-api-key","reqres-free-v1")
		.when()
		 .get("https://reqres.in/api/users?page=2");
		
		//jsonPath
	//1.Convert our response to jsonpath
	   JsonPath jp=   res.jsonPath();
	//2. We need to wite json path to find the element
	//   String str=jp.getString("per_page");
	//3. We will print the value of page
	 //  System.out.println(str);
	   //10
	 //Assert.equlas("","");
	//   Assert.assertEquals(str, "6");
	   
	   //data[3].email--> 
	  String str= jp.getString("data[3].email");
	//  System.out.println(str);  
	  Assert.assertEquals(str, "byron.fields@reqres.in");
	  
	  //print all the emails 
	   
	   
	}

}

package parsing;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class UnderstandingJsonObject {
	
	@Test
	public void parsingUsingJsonObject()
	{
		Response res=	given()
				.header("x-api-key","reqres-free-v1")
				.when()
				 .get("https://reqres.in/api/users?page=2");
		
		res.then().log().body();
		
		//Convert your response to JSONObject
		
		JSONObject jo=new JSONObject(res.asString());
		
		JSONArray ja=jo.getJSONArray("data");
				
		//in array i want zero 
	//	 String e=  ja.getJSONObject(3).getString("email");
	//	 System.out.println("Email "+e);
		 
		 //Loops 
		 for(int i=0;i<ja.length();i++)
		 {
			 Integer e=  ja.getJSONObject(i).getInt("id");
			 System.out.println("id "+e); 
		 }
	}

}

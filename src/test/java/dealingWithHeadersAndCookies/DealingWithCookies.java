package dealingWithHeadersAndCookies;

import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DealingWithCookies {
   
	@Test
	public void specificCookie()
	{
		Response res=RestAssured
		.given()
		.when()
		.get("https://www.google.com");
		
		
//		String str=res.cookie("AEC");
//		String str2=res.cookie("NID");
//		
//		System.out.println(str);
//		System.out.println(str2);
		
		//We can have multiple cookies
		
		//for
		
		Map<String, String> data=	res.getCookies();
		
	//   System.out.println(data.get("AEC"));	;
		
		for(Entry<String, String> e:data.entrySet())
		{
			System.out.println(e.getKey()+" --> "+e.getValue());
		}
		
	}
}

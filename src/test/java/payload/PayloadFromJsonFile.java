package payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PayloadFromJsonFile {
	
	@Test
	public void createStudent() throws FileNotFoundException
	{
		
		//How to read a json file as payload 
		//1.Location of a file
		 File file=new File("./body.json");
		//2.Read the file:   
		  //mouse over on FileReader click on throws declaration
		 FileReader fir=new FileReader(file);
		//3. Conver it into the JSONTokener
		 JSONTokener jt=new JSONTokener(fir);
		//4. Convert it into the JSONObject
		 JSONObject data=new JSONObject(jt);
		 
		 
		RestAssured
		.given()
		.header("x-api-key","reqres-free-v1")
		.body(data.toString())   
		.contentType(ContentType.JSON)
		.when()
		.post("https://reqres.in/api/users")
		.then().log().body();
	}

}

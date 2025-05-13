package payload;

import java.util.HashMap;

import org.testng.annotations.Test;

public class UsingHashmap {
	
	@Test
	public void test1()
	{
		HashMap<String,String> data=new HashMap<>();
		data.put("key1", "value");
		data.put("key1", "value");
		//data.put("Key3","value");
	}
	
	//How to create payload
	//2.JSONObject 
	//3.POJO (java class)
	//4.External file .json

}

package maps;


import java.util.HashMap;

public class Data {
	
	/*{
    "name": "morpheus",
    "job": "leader"
    "address: ".."
}*/

	public static void main(String[] args) {
		
		//HashMap
		
	// HashMap<DataTypeOfKey,DataTypeOfVal> ref=new HashMap<>();
		
	//Keys --> String , Object
	//values -> String
		
		HashMap<String,String> data=new HashMap<>();
		//How to store data in map
		//1. put (Key,    value);
	     data.put("name","morpheus");
	     data.put("Job","leader");
	   
	     //************************************
	     //getTheData(pass the key)
	     
	     String s=data.get("Job");
	     System.out.println(s);
	     
		
	}
}

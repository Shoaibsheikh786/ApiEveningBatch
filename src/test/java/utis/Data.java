package utis;

import com.github.javafaker.Faker;

public class Data {
	

	
	public static String getName()
	{
		Faker faker=new Faker();
		String name=faker.name().fullName();
		return name;
	}

}

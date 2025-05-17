package fakerlib;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class DummyData {

	@Test
	public void generateFakeData() {
		// name

		// 1.object of faker
		Faker f1 = new Faker();
		System.out.println(f1.name().fullName());
		String fname = f1.name().firstName();
		System.out.println(fname);
		System.out.println(f1.name().lastName());
		
		//email
		System.out.println(f1.internet().emailAddress());
		
		System.out.println(f1.demographic().sex());
		
		System.out.println(f1.address().streetAddress());
		
		System.out.println(f1.phoneNumber().phoneNumber());
		
		System.out.println(f1.phoneNumber().cellPhone());
		
		System.out.println(f1.business().creditCardNumber());
		
		System.out.println(f1.book().author());
		
	}

}

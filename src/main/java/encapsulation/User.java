package encapsulation;

public class User {
	public String name = "jack";
	String email = "jack@gmail.com";
	private String password = "mypassword";
	
	void printPassword()
	{
		System.out.println(password);
	}
}
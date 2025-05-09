package ploymorphism;
class Car
{
	void shiftGear()
	{
		System.out.println("shift Gear");
	}
	void brake(int a)
	{
		System.out.println("Brake");
	}
}
public class SportsCar extends Car {
  
	void booster()
	{
		System.out.println("This is booster method");
	}
	
	void brake(int a)
	{ 
		//class Parent/super --> Child/sub
		System.out.println("Power Break");
	}
	public static void main(String[] args) {
//		SportsCar s1=new SportsCar();
//		s1.booster();
//		s1.brake(5);
		
		System.out.println("Hello");
		System.out.println(1234);
		System.out.println(true);
		System.out.println(2.5);
		
	}
}

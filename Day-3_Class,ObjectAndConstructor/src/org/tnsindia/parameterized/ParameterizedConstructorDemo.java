package org.tnsindia.parameterized;
import java.util.Scanner;
//Demo on ParameterizedConstructor
class Bike
{
	//variable
	public int speed;
	
	//Parameterized constructor
	Bike(int s)
	{
		speed=s;
		System.out.println("The speed is: "+speed+"km/hr");
	}

	
	
	
	
}
public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of speed: ");
		int speed=s.nextInt();
		//object creation
		Bike b=new Bike(speed);
		s.close();
	}

}

package org.tnsindia.parameterized;
//Demo on default and parameterized Constructor
import java.util.Scanner;

class Bus
{
	//variable
	public int speed;
	
	//Parameterized constructor
	Bus(int s1)
	{
		speed=s1;
		System.out.println("The speed is: "+speed+"km/hr");
	}
	//Default constructor
	public Bus() {
		
		System.out.println("Default Constructor");
	}
	
}
public class Demo {
	public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of speed: ");
	int s1=s.nextInt();
	//object creation
	Bus b=new Bus();
	Bus b1=new Bus(s1);
	
	s.close();
}
}

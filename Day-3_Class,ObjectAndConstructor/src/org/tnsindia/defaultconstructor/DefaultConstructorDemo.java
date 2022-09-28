package org.tnsindia.defaultconstructor;
//class definition
class Car
{
	//variable
	public int speed;
	//method
	void display()
	{
		System.out.println("The speed is: "+speed+"km/hr");
	}
	//default constructor
	//Constructor is used to initialize the value of the variables
	Car()
	{
		speed=50;
	}
}
public class DefaultConstructorDemo {

	public static void main(String[] args) {
		//object creation
		Car obj=new Car();
		//obj.speed=50;
		//calling the method of car class
		obj.display();

	}

}

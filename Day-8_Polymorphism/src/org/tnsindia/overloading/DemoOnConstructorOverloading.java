package org.tnsindia.overloading;

class Renault{
	
	public String engine;
	
	//constructor overloading
	
	// parameterized constructor
	Renault(String engine)
	{
		this.engine=engine;
	}
	//default constructor
	Renault()
	{
		System.out.println("Default constructor");
	}
	public void display()
	{
		System.out.println("Engine is: "+engine);

	}
}

public class DemoOnConstructorOverloading {

	public static void main(String[] args) {
		//calling default constructor
		Renault r=new Renault();
		//calling parameterized constructor
		Renault r1=new Renault("Disel");
		r1.display();

		

	}

}

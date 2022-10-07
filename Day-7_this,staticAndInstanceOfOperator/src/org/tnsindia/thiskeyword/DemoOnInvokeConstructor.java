package org.tnsindia.thiskeyword;
//4.this keyword is invoking the current class constructor

class D
{
	//default constructor
	D()
	{
		//this keyword is invoking the current class constructor
		this(5);
		System.out.println("Default Constructor");
	}
	//Parameterized constructor
	D(int i)
	{
		System.out.println("Parameterized Constructor");
	}
	
}
public class DemoOnInvokeConstructor {

	public static void main(String[] args) {
		//object creation
		D c=new D();
		
	}

}

package org.tnsindia.superkeyword;

//Parent class or Super class or Base class
class Animal
{
	protected String name="Animal";
	
}
//Child Class
class Dog extends Animal
{
	public String name="Dog";
	//method overriding
	public void display()
	{
		
		System.out.println("The name of the animal is: "+name);
		//to call super class variable
		System.out.println(super.name);

	}
}

public class DemoOnSuperClassVariable {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();

	}

}

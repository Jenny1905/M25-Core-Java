package org.tnsindia.interfaceexample;

import java.util.Scanner;

//3. Program on Nested-Interface
//outer interface
interface InterfaceOuter
{
	//abstract method by default
	void print();
	//Inner interface
	interface InnerInterface
	{
		//abstract method by default
		void display();
	}
}
class ImplementableClass implements org.tnsindia.interfaceexample.InterfaceOuter.InnerInterface
{

	@Override
	public void display() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the batch: ");
		String str=s.nextLine();
		System.out.println("The batch is: "+str);
		
	}
	
}
class ImplementableClassP implements InterfaceOuter
{

	@Override
	public void print() {
		System.out.println("Working on Nested Interface");
		
	}

	
		
	
	
}
public class NestedInterfaceDemo {

	public static void main(String[] args) {
		ImplementableClass i=new ImplementableClass();
		i.display();
		ImplementableClassP i1=new ImplementableClassP();
		i1.print();

	}

}

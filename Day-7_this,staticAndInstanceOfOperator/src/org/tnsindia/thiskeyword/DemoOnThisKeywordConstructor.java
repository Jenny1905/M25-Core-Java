package org.tnsindia.thiskeyword;

import java.util.Scanner;

//2. this can be passed as argument in the constructor call
class B
{
	public String name;
	public int id;
	
	B(String name,int id)
	{
		//this keyword is used here to refer current class var
		this.name=name;
		this.id=id;
	}
	//user-defined-method
	public void print()
	{
		System.out.println("The name is: "+name);
		System.out.println("The ID is: "+id);
	}
}
public class DemoOnThisKeywordConstructor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=s.nextLine();
		System.out.println("Enter the ID: ");
		int id=s.nextInt();
		B a=new B(name,id);
		a.print();

	}

}

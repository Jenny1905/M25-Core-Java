package org.tnsindia.packagedemo;

public class PackageDemo 
{
	public String str;
	/*if any method or variable is declared as default then that method or variable
	 * you cannot access into another package
	 */
	/*
	 *default method
	void display()
	{
		System.out.println("The name of the string is: "+str);
	}*/
	
	/*If you want to access that variable and method, we have to make them as public*/
	public void display()
	{
		System.out.println("The name of the string is: "+str);
	}

}

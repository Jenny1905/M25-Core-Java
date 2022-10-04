package org.tnsindia.superkeyword;

public class Derived extends Base{
	
	//default constructor
		Derived()
		{
			System.out.println("Child Class constructor-Default");
		}
		//Parameterized Constructor
		Derived(int i)
		{
			super(i);
			System.out.println("Child Class constructor-Parameterized");

		}

}

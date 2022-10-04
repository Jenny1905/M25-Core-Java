package org.tnsindia.finalkeyword;

class FinalMethod
{
	//final method cannot be overriden
	/*
	final void accept()
	{
		System.out.println("Final method cannot be override");
	}*/
}
class Child extends FinalMethod
{
	void accept()
	{
		System.out.println("Child class");
		
	}
	
}
public class DemoOnFinalMethod {

	public static void main(String[] args) {
		Child c=new Child();
		c.accept();
		

	}

}

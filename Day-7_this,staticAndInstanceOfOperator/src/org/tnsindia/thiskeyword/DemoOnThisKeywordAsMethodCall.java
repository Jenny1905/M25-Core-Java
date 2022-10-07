package org.tnsindia.thiskeyword;
//3.this can be passes as an argument in the method call
class C
{
	
	public void display(C c)
	{
		System.out.println("Display function invoked");
	}
	//user-defined-method
	public void print()
	{
		display(this);
	}
}
public class DemoOnThisKeywordAsMethodCall {

	public static void main(String[] args) {
		C c=new C();
		c.print();

	}

}

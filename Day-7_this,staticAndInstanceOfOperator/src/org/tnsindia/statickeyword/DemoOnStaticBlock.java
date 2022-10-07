package org.tnsindia.statickeyword;

public class DemoOnStaticBlock {

	static int a=10;
	//int b=20;
	static int b;
	//static block-used to initialize staic data members
	static
	{
		//we can't use non-static variable inside the static block
		b=a+50;
	}
	
	static public void main(String args[]) {
		System.out.println("value of a:" +a);
		System.out.println("value of a:" +b);

	}

}

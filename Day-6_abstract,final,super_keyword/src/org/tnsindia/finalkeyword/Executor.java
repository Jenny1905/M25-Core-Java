package org.tnsindia.finalkeyword;

public class Executor {

	public static void main(String[] args) {
		
		//driver code for final class-ChildFinalClass
		ChildFinalClass c=new ChildFinalClass();
		c.print();
		
		//driver code for final method inherited but not be override-B class
		B b=new B();
		b.display();
		b.print();
		
		//driver code for final method-Child class
		Child c1=new Child();
		c1.accept();
		
		
		
		

	}

}
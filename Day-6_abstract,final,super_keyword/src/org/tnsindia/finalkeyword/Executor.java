package org.tnsindia.finalkeyword;

public class Executor {

	public static void main(String[] args) {
		
		//driver code for final class-ChildFinalClass
		ChildFinalClassDemo c=new ChildFinalClassDemo();
		c.print();
		
		//driver code for final method inherited but cannot be override-B class
		ChildFinalMethodInherited b=new ChildFinalMethodInherited();
		b.display();
		b.print();
		
		//driver code for final method-Child class
		ChildFinalMethodDemo c1=new ChildFinalMethodDemo();
		c1.accept();
		
		//driver code for final variable
		FinalVariableDemo f1=new FinalVariableDemo();
		System.out.println(f1.salary);
		//FinalVariable.display();
		
		
		
		

	}

}
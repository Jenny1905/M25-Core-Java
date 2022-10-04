package org.tnsindia.abstractkeyword;
//Program on abstract class and Abstract method
//if any class contains atleast one abstract method then that class must be declare as "abstract"
abstract class A
{
	//abstract method
	abstract void print();
}
class B extends A
{
	//providing the implementation to abstract method inside the child class

	@Override
	void print() {
		int balance=50000;
		
		System.out.println("Account balance is: "+balance);
		
	}
	
}
public class ATMMachine {

	public static void main(String[] args) {
		//we cannot create the object for abstract class
		/*A a=new A();*/
		A a=new B();
		a.print();

	}

}

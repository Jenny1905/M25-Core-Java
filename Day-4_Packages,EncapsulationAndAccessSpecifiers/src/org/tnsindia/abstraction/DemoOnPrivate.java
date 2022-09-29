package org.tnsindia.abstraction;
//Demo on private access specifier
class A
{
	//private variable
	private float salary;

	//setters and getters to access private data members into another class
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}



public class DemoOnPrivate {

	public static void main(String[] args) {
		A a=new A();
		a.setSalary(60000f);
		System.out.println("The salary is: "+a.getSalary());

	}

}

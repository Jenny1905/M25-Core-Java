package org.tnsindia.inheritance;
//Parent Class
class Vehicle
{
	private String name="Car";
	//if this method is private we can't access into another class
	public void display()
	{
		System.out.println(name);
	}
}
//Child Class For Vehicle
class BMW extends Vehicle
{
	private  String name1="BMW";
	public void display1()
	{
		System.out.println(name1);
	}
	
}
//Child Class For BMW
class Tyre extends BMW
{
	private String tyrename="BridgeStone";
	public void display2()
	{
		System.out.println(tyrename);
	}
	
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Tyre t=new Tyre();
		t.display();
		t.display1();
		t.display2();
		
		

	}

}

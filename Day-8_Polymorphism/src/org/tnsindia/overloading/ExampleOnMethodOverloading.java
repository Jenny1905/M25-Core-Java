package org.tnsindia.overloading;
//Demo on method overloading -by changing the no. of arguments
class Shape
{
	//method overloading
	//zero-arg
	public void area()
	{
		System.out.println("Find area:");
	}
	//one-arg
	public void area(int r)
	{
		System.out.println("Area of Circle:"+(3.14*r*r));
	}
	//two-arg
	public void area(int l,int b)
	{
		System.out.println("Area of Rectangle:"+(l*b));
	}
	
	
}
/*for method overloading child class is not required*/
public class ExampleOnMethodOverloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area();
		s.area(2);
		s.area(10, 15);

	}

}

package org.tnsindia.annotations;


class DeprecatedDemo
{
	@Deprecated
	//Deprecated method is used with unimportant methods,fields,etc
	public void display()
	{
		System.out.println("Deprecated annotation demo");
	}
}
public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		DeprecatedDemo d=new DeprecatedDemo();
		d.display();

	}

}

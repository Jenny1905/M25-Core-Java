package org.tnsindia.finalkeyword;

//Demo on final keyword with variable

class FinalVariable
{
	//if any variable is declared as final , we can't change the value of that variable
	
	public final float salary=62000f;
	/*void display()
	{
		salary=65000f;
		System.out.println("Salary is :"+salary);
	
	}*/
	

}
public class DemoOnFinalVariable {

	public static void main(String[] args) {
		FinalVariable f1=new FinalVariable();
		System.out.println(f1.salary);
		//f1.display();

	}

}

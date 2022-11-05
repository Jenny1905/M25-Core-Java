package org.tnsindia.exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
				//by default it takes 0 as we have not pass any argument
				int a=args.length;
				System.out.println("the length of a is: "+a);
				int b=12/a;
				System.out.println(b);
				int arr[]= {11,33,55};
				System.out.println(arr[3]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
		//Default Exception-Parent Catch block
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		finally
		{
			System.out.println("Finally block");

		}
		

	}

}

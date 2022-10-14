package org.tnsindia.customexception;

public class SimpleCustomExceptionExecutor {

	public static void main(String[] args)  {
		/* In order to use our own custom exception,we've to create a new object of the class
		 * and throw it using the throw keyword
		 */
		try {
			throw new SimpleCustomException("User-Defined Exception Demo");
			
			
		}
		catch(SimpleCustomException e)
		{
			System.out.println(e);
			
		}

	}

}


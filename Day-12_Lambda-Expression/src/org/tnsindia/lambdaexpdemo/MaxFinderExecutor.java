package org.tnsindia.lambdaexpdemo;
//driver class
public class MaxFinderExecutor {

	public static void main(String[] args) {
		/*MaxFinderChildDemo d=new MaxFinderChildDemo();
		d.max(45, 17);*/
		//Lambda Expression
		/*MaxFinderDemo obj=(int a,int b)->
		{
			int result=(a>b)?a:b;
			
			System.out.println("The maximum number is:" +result);
		};
		obj.max(13, 98);*/
		
		//lambda expression without return type
		MaxFinderDemo obj=(a,b)->a>b?a:b;
		System.out.println("The maximum no.is: " +obj.max(25, 6));

	}

}

package org.tnsindia.enumdemo;

public class EnumMealDemo {

	public static void main(String[] args) {
		//we cannot create the object for enum
		//Meal m=new Meal();
		for(Meal m:Meal.values())
		{
			System.out.println(m+" "+m.getValue());
		}

	}

}

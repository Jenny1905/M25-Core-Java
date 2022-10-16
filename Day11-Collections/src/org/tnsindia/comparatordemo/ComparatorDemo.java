package org.tnsindia.comparatordemo;

import java.util.Arrays;

public class ComparatorDemo {

	public static void main(String[] args) {
		Employee emp[]=new Employee[2];
		
		//for emp1
		emp[0]=new Employee();
		emp[0].setAge(25);
		emp[0].setName("Pushkar");
		
		//for emp2
		emp[1]=new Employee();
		emp[1].setAge(22);
		emp[1].setName("Shiwani");
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee "+(i+1)+"Name: "+emp[i].getName()+" "+emp[i].getAge());
		}
		//
		Arrays.sort(emp, new AgeComparator());
		//age:22-emp1,age:25-emp2
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee "+(i+1)+"Name: "+emp[i].getName()+" "+emp[i].getAge());
		}

		
		

	}

}

package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilteringMethodDemo {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[] {56,97,34,81,56,97}); 
		//filter() method
		obj1.stream().filter(i->i>58).forEach((i)->System.out.print(i+" "));
		System.out.println();
		//distnct() method
		obj1.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		//limit(n)
		obj1.stream().limit(3).forEach((i)->System.out.print(i+" "));
		System.out.println();
		//skip(n)
		obj1.stream().skip(4).forEach((i)->System.out.print(i+" "));



	}

}

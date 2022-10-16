package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet<>();
		s.add("Parikshit");
		s.add("Shubham");
		s.add("Tejal");
		s.add("Rutuja");
		System.out.println("The elements in the TreeSet are: "+s);

	}

}

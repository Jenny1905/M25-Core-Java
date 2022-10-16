package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Example on List Interface using ArrayList
public class ArrayListDemo {

	
	public static void main(String[] args) {
		
		//creating a first list using arrayList
		List<String> list=new ArrayList<String>();
		list.add("Shubham");
		list.add("Shiwani");
		list.add("Parikshit");
		//enhanced for loop is used to extract the elements of your ArrayList
		/*for(String itr:list)
		{
			System.out.println(itr);
		}*/
		
		List<String> list1=new LinkedList<String>();
		list1.add("Nia");
		list1.add("Ashwini");
		list1.add("Rajan");
		
		
		//using Iterator we can extract the elements of a list
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("The elements in List1 are: "+list);
		System.out.println("The elements in List2 are: "+list1);
		//contains()method is used to check whether list conatins that element or not 
		System.out.println(list.contains("Neha"));
		//size is used to print the length
		System.out.println(list.size());
		//remove() is used to remove the specified index value
		System.out.println(list.remove(1));
		System.out.println("The elements are: "+list);
		//adding the list2 elements to list1
		list.addAll(list1);
		System.out.println("The elements in List1 are: "+list);
		list.removeAll(list1);
		System.out.println("The elements in List1 are: "+list);
		Collections.sort(list1);
		System.out.println("The elements in List2 are: "+list1);
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("The elements in List2 are: "+list1);
		

	}

}

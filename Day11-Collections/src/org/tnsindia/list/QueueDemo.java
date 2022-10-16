package org.tnsindia.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//Queue is a interface , we can't create the obj for it
		Queue<Character>list=new PriorityQueue<>();
		list.add('Z');
		list.offer('a');
		list.offer('s');
		list.offer('p');
		//enhance for loop
		for(Character c:list)
		{
			System.out.println(c);
		}
		System.out.println(list);
		list.poll();
		System.out.println(list);
		//remove will delete the head element
		list.remove();
		list.remove();
		list.remove();
		/*list.poll();
		list.poll();
		list.poll();*/
		
		System.out.println(list);
		list.remove();
		System.out.println(list);

		//peek will gives us head element
		//System.out.println(list.peek());
	}

}

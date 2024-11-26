package Sample;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		ll.add(22);
		ll.add(24);
		ll.add(25);
		ll.add(27);
		ll.add(43);
		ll.add(34);
		ll.add(25);
		ll.add(19);
		ll.add(1098);
		ll.add(232);
		
		System.out.println("Linked list is :"+ll);
		System.out.println("Size of linked list: "+ ll.size());
		ll.add(456);		
		System.out.println("After adding new elemint 456 :");
		System.out.println("Size of linked list: "+ ll.size());
		
		// add new element at 8th position
		ll.add(8,40000);
		System.out.println("Size of linked list: "+ ll);
		
		// display first eliment
		System.out.println("Linked list is :"+ll.get(0));
		
		//display sorted order
		Collections.sort(ll);
		System.out.println("Linked list is :" +ll);
		System.out.println("Linked list is :"+ll.get(0));
		
		//display in reverse order
		System.out.println("Linked list in reverse order :");
		Collections.reverse(ll);
		System.out.println("Linked list is :" +ll);
		
		//remove 5th element
		System.out.println("Linked list after removing 5th element:");
		ll.remove(5);
		System.out.println("Linked list is :" +ll);
		
		//update 10th element to 230000
		System.out.println("Update 10th element to 230000 :");
		ll.set(10,230000);
		System.out.println("Linked list is :" +ll);
		
		System.out.println("New Linked list is :");
		LinkedList<Integer> ll2=new LinkedList<Integer>();
		ll2.addAll(ll);
		System.out.println("Linked list is :" +ll);
		
		System.out.println("Add First 2 and add last to 89");
		ll.addFirst(2);
		ll.addLast(89);
		System.out.println("Linked list is :" +ll);
		
		System.out.println("remove First 2 and remove last to 89");
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Linked list is :" +ll);
		
		//Clear all the elements
		System.out.println("Linked list after clear all elements :");
		ll.clear();
		System.out.println("Linked list is :" +ll);		
		System.out.println("Linked list is :" +ll.isEmpty());
		
		
	}

}

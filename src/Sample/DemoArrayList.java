package Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoArrayList {
	
	public static void main(String[] args) {
		
	ArrayList al=new ArrayList();
	al.add("ravi");
	al.add(100);
	al.add(null);
	al.add("Sankar");
	al.add(null);
	al.add(13);
	al.add(6.7);
	al.add("A");
	Collections.reverse(al);
	
	System.out.println("Array list elements are :" +al);
	System.out.println(al.size());
	System.out.println(al.get(1));
	System.out.println(al.add(23455));
	System.out.println("Array list elements are :" +al);
	al.add(3,"neeyabba");
	System.out.println("Array list elements are :" +al);
	al.set(3, "neeyamma");
	System.out.println("Array list elements are :" +al);
	//using enhanced loop
	System.out.println("Using enhanced for loop++++++++++++++++");
	for(Object e:al) {
		System.out.println(e);
	}
	System.out.println("Using for loop+++++++++++");
	for(int i=0; i<al.size(); i++) {
		
		System.out.println(al.get(i));
	}
	System.out.println("Using iterator++++++++++++++++");
	Iterator it=al.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println("Second Array: ");
	ArrayList al2=new ArrayList(al);
	System.out.println("Array list elements are :" +al2);
	
	System.out.println("Array list elements are :" +al2);
	al2.clear();
	System.out.println("Array list elements are :" +al2);
	System.out.println("Array list elements are :" +al2.isEmpty());
	al.remove(1);
	System.out.println("Array list elements are :" +al);
	}

}

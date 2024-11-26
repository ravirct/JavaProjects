package Sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
		// Declaration
		ArrayList myList=new ArrayList();
		//List myList=new ArrayList();
		//ArrayList <String> mylist=new ArrayList<String>();		
		//Adding data into ArrayList
		
		myList.add(100);
		myList.add(10.5);
		myList.add("welcome");
		myList.add("A");
		myList.add(true);
		myList.add(100);
		myList.add(null);
		myList.add(null);
		
		//Size of ArrayLkist
		System.out.println("size of an arrayList: "+myList.size());
		System.out.println("printing data from arrayList"+myList);
		
		//Remove element from arraylist
		myList.remove(5);
		System.out.println("printing data from arrayList"+myList);
		
		//Insert element in the arraylist
		myList.add(4, "J");
		System.out.println("printing data from arrayList"+myList);
		
		//modify element(modify/replace/change)
		myList.set(4, "Phython");
		System.out.println("printing data from arrayList"+myList);
		
		//Access specific element from arrayList
		System.out.println(myList.get(3));
		
		//Reading all the elements from arrayList
		
		//using normal FOR loop
//		for(int i=0; i<myList.size(); i++) {
//			System.out.println(myList.get(i));			
//		}
		
		//using enhanced for loop
//		for(Object x:myList) {
//			System.out.println(x);		
//		}
		
		//using iterator
		
		Iterator it= myList.iterator();
		
		while(it.hasNext())
		{
		 System.out.println(it.next());
		}
		
		//Checking arrayList is empty or not
		System.out.println("Is arrayList empty?" +myList.isEmpty());
		
		//remove all the elements from array list
		ArrayList myList2=new ArrayList();
		myList2.add("true");
		myList2.add(null);
		
		myList.removeAll(myList2);
		System.out.println("print data from ArrayList" +myList);
		
		// remove all the elements
		myList.clear();
		System.out.println("print data from ArrayList" +myList);
		System.out.println("Is arrayList empty?" +myList.isEmpty());
	}

}

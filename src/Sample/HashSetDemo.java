package Sample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {	
	public static void main(String[] args) {		
		//Declaration		
		HashSet myset=new HashSet();
		//Set myset=new HashSet();		
		//HashSet<String> myset= new HashSet<String>();		
		//Adding elements into hashset
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);
		
		//Remove specific element from then set
		myset.remove(10.5); //10.5 is value, not an index
		
		
				
		//Inserting is not possible in SET
		//Access specific value is not possible, but there is a work around
		//Convert HashSet to ArrayList
		ArrayList al=new ArrayList(myset);
		System.out.println(al.get(2));
		
		//Read all the elements using for..each
		
//		for(Object x:myset) {
//			System.out.println(x);
//		}
		
		Iterator it=myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

package Sample;

import java.util.HashMap;
import java.util.Map.Entry;

public class DemoHashMap {
	public static void main(String[] args) {
		String[] coursesArr= {"c", "C++"};
		HashMap<String, Object> hm=new HashMap<>();
		hm.put("name", "Ravi");
		hm.put("phone", "974298765");
		hm.put("city", "Rayachoty");	
		hm.put("Courses", coursesArr);
		
		System.out.println("HashMap Elements are :" +hm);
		System.out.println("HashMap Elements are :" +hm.get("name"));
		System.out.println("HashMap Elements are :" +hm.size());
		System.out.println("HashMap Elements are :" +hm.keySet());
		System.out.println("HashMap Elements are :" +hm.values());
		System.out.println("HashMap Elements are :" +hm.entrySet());
		
		for(Entry<String, Object> e:hm.entrySet()) {
			System.out.println("HashMap Elements are :" +e);
		}
	}

}

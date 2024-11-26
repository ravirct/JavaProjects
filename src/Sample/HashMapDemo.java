package Sample;
import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		//HashMap<Integer, String>=new HashMap<Integer, String>();
		
		hm.put(100,"John");
		hm.put(101,"David");
		hm.put(102,"Mary");
		hm.put(103,"Scott");
		
		System.out.println("Size of HashMap :"+hm.size());
		System.out.println("HashMap data:"+hm);
		
		//remove pair
		hm.remove(100);
		System.out.println("After removing pair:"+hm);
		
		//Access value of the key
		System.out.println(hm.get(101));
		
		//get all the keys from hashmap
		System.out.println("HashMap keys:"+hm.keySet());
		System.out.println("HashMap keys:"+hm.values());
		System.out.println(hm.entrySet());
		for(Object k:hm.keySet())
		{
			System.out.println(k+"   "+hm.get(k));
		}
		
		hm.clear();
		System.out.println("is empty "+hm.isEmpty());
		
		
	}

}

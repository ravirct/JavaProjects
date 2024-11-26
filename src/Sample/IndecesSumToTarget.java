package Sample;

import java.util.HashMap;
import java.util.Map.Entry;

public class IndecesSumToTarget {
	public static void main(String[] args) {
		
		int[] nums= {2, 8, 23,1};
		int target=9;
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
			
		for(int i=0; i<nums.length; i++)
		{
			hm.put(i, nums[i]);
		}
		
		for(int i=0; i<nums.length; i++) {
			int no1=nums[i];
			int no2=target-no1;
			
			if(hm.containsValue(no2)) {
				int[] indeces = new int[2];			
				indeces[0]=i;
				for(Entry<Integer, Integer> entry:hm.entrySet()) {
					if(entry.getValue().equals(no2))
					{
					indeces[1]=entry.getKey();
					System.out.println("Indeces:["+indeces[0] +"," +indeces[1] +"]");
					break;
					}
				}
				
			}
		}
	
	}
}


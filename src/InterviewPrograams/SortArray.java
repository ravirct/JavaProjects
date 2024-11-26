package InterviewPrograams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	
	public static void main(String[] args) {
	
	Integer [] BArray= {2, 4, 5, 7, 5, 3, 4, 8};
	
	//printing original Array
	System.out.println("Original Array" +Arrays.toString(BArray));
	
	//Arrays.sort(BArray);
	Arrays.sort(BArray, Collections.reverseOrder());
	
	
ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(BArray));
//	Collections.reverse(al);
	
	//printing the sorted Array
	System.out.println("Original Array" +Arrays.toString(BArray));
	
	//System.out.println("Original Array" +al);

}
}

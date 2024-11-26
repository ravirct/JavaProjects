package InterviewPrograams;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		int[] i= {5, 3, 7, 4, 8, 9, 2};
		//char[] i= {'a', 'r', 's', 't', 'r'};
		
		Arrays.sort(i);		
		System.out.println("Sorted Array is: " +Arrays.toString(i));
		
		System.out.println("3rd highest number is :"+i[i.length-3]);
		
		String str="Hello";
		System.out.println(str.concat("world"));
		
		
		
	}

}

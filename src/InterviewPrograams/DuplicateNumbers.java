package InterviewPrograams;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumbers {
	
	public static void main(String[] args) {

		//int[] originalArray= {2, 4, 5, 6, 4, 6, 9, 3};	

		
		System.out.println("Enter the size of the Array of numbers: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] originalArray= new int[n];
		
		System.out.println("Enter the array values: ");
		for(int i=0; i<n; i++) {
		originalArray[i]=sc.nextInt();
		}
		
		
		Set<Integer> finalArray= new HashSet<>();
		for(int i: originalArray) {
			finalArray.add(i);
		}
		System.out.println("final Array of values after removing duplicate values: ");
		//System.out.println(finalArray);
		
		
	}
	
}

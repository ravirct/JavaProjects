package InterviewPrograams;

import java.util.Arrays;

public class BubleSort {
	public static void main(String[] args) {
		int a[] = {67, 54,90, 87, 54, 34, 54, 64, 43};
		System.out.println("Arrays before string" +Arrays.toString(a));
		int n=a.length-1;
		
		for(int i=0; i<n; i++)
			for(int j=0;j<n; j++ )
			{
				if (a[j] > a[j+1]) {
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;					
					}	
								
			}
		
		System.out.println("Sorted order :" +Arrays.toString(a));
		
	}

}

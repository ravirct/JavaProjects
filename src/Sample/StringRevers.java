package Sample;

import java.util.Scanner;

public class StringRevers {
	public static void main(String[] args) {
		String str, revStr;
		
		System.out.println("Type the string that needs to be reversed :");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		// Printing original string
		System.out.println("The original string is: "+str);
		
//		Method#1;
//		
//		StringBuilder sb = new StringBuilder(str);
//		revStr=sb.reverse().toString();
//		
//		// Printing final string
//		System.out.println("The reversed string is: "+revStr);
		
		//Method2
		char[] charArray=str.toCharArray();
		
		int left=0;
		int right=(charArray.length)-1;
		char temp;
		
		while(left<right) {
			temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;			
		}
		String revStr1 = new String(charArray);
		//Printing final string
		System.out.println("The reversed string is: "+revStr1);	
		
		
	}

}

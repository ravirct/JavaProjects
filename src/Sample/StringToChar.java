package Sample;

import java.util.Arrays;

public class StringToChar {
	
	public static void main(String[] args) {
		
		String str= "Ravi Sankar is Good Boy";
		StringBuilder result = new StringBuilder();
		StringBuilder newStr=new StringBuilder(str);
		System.out.println("Original String: "+str);
		System.out.println("Reverse String: "+newStr.reverse());
		
		
		char[] charArray=str.toCharArray();		
		int left=0;
		int right=charArray.length-1;
		char temp;
			
		while(left<=right)
			{
			temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
			}
		
		for(char c: charArray)
		{
			if(Character.isLowerCase(c)) {
				c=Character.toUpperCase(c);
				result.append(c);
			}
			else if(Character.isUpperCase(c)) {				
				c=Character.toLowerCase(c);
				result.append(c);
			}
			else {
				result.append(c);		
			  };
		}	  
		System.out.println(result);
			
		}
}

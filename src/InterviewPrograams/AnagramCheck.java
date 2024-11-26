package InterviewPrograams;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
		
		String s1="SILENT";
		String s2="Li sTEN";
		
		s1=s1.replaceAll("[\\s]", "").toLowerCase();
		s2=s2.replaceAll("[\\s]", "").toLowerCase();
		
		char[] word1=s1.toCharArray();
		char[] word2=s2.toCharArray();
		
		//Sorting the Array
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		if(Arrays.equals(word1, word2)) {			
			System.out.println("Given words are anagrams");			
		} else
			System.out.println("Given words are not anagrams");		
		
		
	}

}

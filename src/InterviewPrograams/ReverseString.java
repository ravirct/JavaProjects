package InterviewPrograams;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="ABCD";
		//String revStr="";
		
		int len=str.length();
		
		
		//Method 1
		
		/*for(int i=len-1; i>=0; i--) {
		revStr=revStr+str.charAt(i);	
		}*/
		
		//Method 2
		/*
		 char[] a = str.toCharArray(); for(int i=len-1; i>=0; i--) {
		 revStr=revStr+a[i]; }
		 */
		
		// method3
		
		StringBuffer sb=new StringBuffer(str);
		StringBuffer revStr=sb.reverse();
		System.out.println("Reverse String is: " +revStr);
	}
}

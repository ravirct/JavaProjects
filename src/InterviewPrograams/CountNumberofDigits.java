package InterviewPrograams;

public class CountNumberofDigits {
	public static void main(String[] args) {
		
		int num= 56522222;
	    int sum=0;
	    int count=0;
	    int digit=0;
	    
	    
	    while(num>0) {
	    	digit=num%10;
	    	num=num/10;
	    	sum=sum+digit;
	    	count++;
	    	    	
	    }
		
	    System.out.println("Sum of number of digits: " +sum);
	}

}

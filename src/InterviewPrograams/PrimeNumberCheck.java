package InterviewPrograams;

import java.util.Scanner;

public class PrimeNumberCheck {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number for which you need to check prime: ");
	int num=sc.nextInt();
	
	int count=0;	
	if(num>1) {
		for(int i=1;i<=num; i++) {
			if ((num%i)==0) 
				count++;			
			
		}
		
		if(count==2)
			System.out.println("Given number is Prime");
		else
			System.out.println("Given number is not a Prime");
			
	}
		
	else {
		
		System.out.println("Given number is not a Prime");
	}
	
			
}
}

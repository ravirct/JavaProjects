package InterviewPrograams;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int orginal_num=num;
		int revNum=0;
		
		while(num>0) {
			revNum=(revNum*10)+(num%10);
			num=num/10;			
		}
		
		if(orginal_num == revNum)
			System.out.println("Number given is a Palindrome Number: "+revNum);
		else
			System.out.println("Number given is not a Palindrome Number: "+revNum);
		
				
	}

}

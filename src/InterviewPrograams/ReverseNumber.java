package InterviewPrograams;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		//Method1  Algorithm		
		/*while(num>0) {
		revNum=(revNum*10)+num%10;
		num=num/10;
		}*/
		
		//Method2 		
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer revNum=sb.reverse();*/
		
		//Method3		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder revNum=sb.reverse();	
		System.out.println("Reverse number: " +revNum);
	}	

}

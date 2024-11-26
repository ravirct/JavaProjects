package InterviewPrograams;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter number a :");
			int a=sc.nextInt();
			System.out.println("Enter number b :");
			int b=sc.nextInt();
			
			
			// Method-1:
			
			/*int Temp=a;
			a=b;
			b=Temp;*/
			
				
			//Method2
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("Numbers after echange : a="+a +",b="+b);
		} catch (Exception e) {
			
			System.out.println("Exception message: "+e);
		}
		
		
	}

}

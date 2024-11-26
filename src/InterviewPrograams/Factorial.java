package InterviewPrograams;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter factorial number: ");
	int n=sc.nextInt();
	
	long fact=1;
	
	for(int i=1; i<=n; i++) {
		fact=fact*i;
	}
	
	System.out.println("Factorial value is: " +fact);
	
	
}
	
}

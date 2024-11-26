package Sample;

import java.util.Scanner;

public class FibinocciSeries {
	public static void main(String[] args) {
	int n,a,b,c;
	
	System.out.println("Enter length of the Fibonacci series :");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	a=0;
	b=1;
	System.out.print(a+", "+b);
	for(int i=3; i<=n; i++) {
			
		c=a+b;
		System.out.print(", "+c);
		a=b;
		b=c;		
				
	}
	
	}
}

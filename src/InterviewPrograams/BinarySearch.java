package InterviewPrograams;

public class BinarySearch {
	public static void main(String[] args){
		
		int[] a= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key=11;
		boolean flag=false;
		int l=0;
		int r=a.length-1;
		
		while(l<=r) {
			
			int m=(l+r)/2;
			
			if(a[m]==key) {				
				System.out.println("Element found :"+a[m]);
				flag=true;
				return;				
			}
			
			if(a[m]<key) {
				l=m+1;					
			}
			
			if(a[m]>key) {
				r=m-1;
			}
			
		}
		
		if (flag == false)
			System.out.println("Element not found :"+key);	
		
		
	}

}

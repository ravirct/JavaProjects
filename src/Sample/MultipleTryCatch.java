package Sample;

public class MultipleTryCatch {
	public static void main(String[] args) {
		
		try {
			int result=12/0;
			
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught "+e.getMessage());
		}
		
		try {
			String str=null;
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointer Exception caught "+e.getMessage());
			
		}
	}

}

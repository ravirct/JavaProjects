package InterviewPrograams;

public class ExceptionClass {
	
	public static void main(String[] args) {
		try {		
			riskyMethod();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}		
		
	}
	
	public static void riskyMethod() throws Exception {		
		throw new Exception("this is a ravi sankar exception");
	}

}

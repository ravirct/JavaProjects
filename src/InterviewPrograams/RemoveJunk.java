package InterviewPrograams;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String str="$$%$Ravi is a ()good bo98y";
		System.out.println("String before removal of Junk: "+str);
		String newStr=str.replaceAll("[^A-Za-z\\s]", "");
		System.out.println("New String: "+newStr);
	}
}

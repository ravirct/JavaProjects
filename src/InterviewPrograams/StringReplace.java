package InterviewPrograams;

public class StringReplace {
	public static void main(String[] args) {
		String str="the the a a Anupama";
		String[] words= str.split(" ");
		
		for(String word : words)
		{
			if(word.equalsIgnoreCase("the")){
				word="2";
			}else if (word.equalsIgnoreCase("a")) {
				word.equals(word);
				word="1";
			}else if (word.equalsIgnoreCase("Anupama")) {
				
				word="1";
			}
				
		System.out.print(word);
	}

}
}

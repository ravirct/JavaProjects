package Sample;

public class RemoveSpecialCharacters {
		public static void main(String[] args) {
			String str="!This %^is Ravi San)*ka!r 2024";
			// Printing original string
			System.out.println("The original string is: "+str);
			String strNew=str.replaceAll("[^a-zA-Z0-9\\s]", "");
			
			// Printing the  string after removal of special characters
			System.out.println("The original string is: "+strNew);
			
		}

}

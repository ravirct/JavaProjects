package InterviewPrograams;

interface Animall{
	
	void sound();
	void sleep();
}

class Dogg implements Animall{
	
	public void sound() {
		System.out.println("The dog Barks");
	}
		
	public void sleep() {		
		System.out.println("The dog Sleeping");
	}
	
}

public class InterfaceExample {
	public static void main(String[] args) {
	
		Dogg myDog=new Dogg();
		myDog.sound();
		myDog.sleep();	

}
}

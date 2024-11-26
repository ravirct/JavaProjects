package InterviewPrograams;

abstract class Animal2 {

	public void sleeping() {
		System.out.println("Animlas are sleeping");
	}

	abstract public void sound();

}

class Dog2 extends Animal2 {
	public void sound() {
		System.out.println("Dog makes sound bow bow");
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		Animal2 dog = new Dog2();
		dog.sleeping();
		dog.sound();
	}

}

package InterviewPrograams;


abstract class Animal{
	
	public abstract void sound();
	public void color() {
		System.out.println("Color of the Animal is: Black");
	}	
}

class Dog extends Animal{
	public void sound() {
		System.out.println("The dog says : Bark... Bark ...");
	}
	
	@Override
	public void color() {
		System.out.println("Color of the dog is: Black");
	}
}

class Cat extends Animal{
	public void sound() {
		System.out.println("The cat says : Miao...Miao");		
	}
}

public class Strings {
	public static void main(String[] args) {
		
		Animal dog=new Dog();		
		dog.sound();
		dog.color();
		
		Animal cat=new Cat();		
		cat.sound();
		cat.color();
	}
}

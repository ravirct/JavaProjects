package pack1;

public class AccessModifier1 {

	public int a;
	private double d;
	protected char c;
	String str;
	
	public void display() {
		
		System.out.println("a= "+a);
		System.out.println("d= "+d);
		System.out.println("c= "+c);
		System.out.println("str= "+str);
	}
	
	public static void main(String[] args) {
		
		AccessModifier1 am=new AccessModifier1();
		am.a=5;
		am.d=6;
		am.c='r';
		am.str="Ravi is good boy";
		
		am.display();
	}
	
}

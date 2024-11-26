package pack1;

public class AccessModifier2 {
	public static void main(String[] args) {
	AccessModifier1 am1=new AccessModifier1();
	am1.a=7;
	//am1.d=8.0;  can not access private from another class
	am1.c='S';
	am1.str="Ravi is good boy";	
	am1.display();			
	
	}
}

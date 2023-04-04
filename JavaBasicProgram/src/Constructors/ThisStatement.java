package Constructors;

class A2 {
	A2() {	
		this(10);
		System.out.println("hello zero");
	}
	A2(double d) {

		System.out.println("hello double " + d);
	}
	A2(int x) {
		this(2.36);
		System.out.println("Hello int " + x);
	}
}
public class ThisStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A1 a1=new A1();
//		 A1 a2=new A1(10);
//		 A1 a3=new A1(10.23);
			//or
		A2 a1 = new A2();
	}

}
/**
 * this  ---> keyword
 * this()---> statement
 * this(): used to call another constructor of current class based on its argument
 * this(): should be the first statement inside the constructor body
 * this(): should be used only in constructor
 */
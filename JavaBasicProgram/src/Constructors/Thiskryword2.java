package Constructors;
class A
{
	void m() {
		System.out.println("hello m");
	}
	
	void n() {
		System.out.println("hello n");
	}
}

public class Thiskryword2 {
	
	void methodOne() {
		System.out.println("inside method one");
	}
	void methodTwo() {
		System.out.println("Inside method two");
		this.methodOne();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskryword2 t1=new Thiskryword2();
		t1.methodOne();
		//t1.methodTwo();
		A a=new A();
		a.n();
		a.m();
		
		
		}

}

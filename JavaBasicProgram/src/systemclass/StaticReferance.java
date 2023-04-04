package systemclass;

class Demo{
	void display() {
		System.out.println("demo class display method");
	}
	void callMe() {
		System.out.println("demo class callme method");
	}
	Demo(){
		System.out.println("demo class construtor");
	}
}

public class StaticReferance {

	static final Demo demoref= new Demo();
	
	static int age=30;
	static void calling() {
		System.out.println("Calling...");
	}
	void test() {
		System.out.println("static referance class test method.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.callMe();
		d.display();
		
		StaticReferance s=new StaticReferance();
		s.test();
		StaticReferance.calling();
		System.out.println(StaticReferance.age);
		
	//  classname.staticref.methodname
		StaticReferance.demoref.display();
		StaticReferance.demoref.callMe();
		
		//classname.staticRef.method
		System.out.println("hello");
		System.out.println("I am an error msg.");
	}

}

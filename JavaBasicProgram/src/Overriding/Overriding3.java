package Overriding;

class ABC{
	public void myMethod() {
		System.out.println("I am ABC");
	}
}
class Overriding3 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("overriding method of class Overriding3");
	}

	public static void main(String[] args) {
		Overriding3 o=new Overriding3();
		o.myMethod();

	}

}

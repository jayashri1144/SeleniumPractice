package Overriding;
class Parent2{

    // private methods are not overridden, because private member doesn't 
	//participate in inheritance
	private void m1() {
		System.out.println("from parent m1()");
	}
	protected void m2() {
		System.out.println("from parent m2()");
	}
}

class Child2 extends Parent2{
	// new m1() method
    // no overriding here as its a private method, unique to Child class
	private void m1() {
		System.out.println("from child m1()");
	}
	// overriding method
    // with more accessibility
    @Override
	protected void m2() {
		m1();//private members are accessible within a class only
		System.out.println("from child m2()");
	}
}
public class Overriding5 {

	public static void main(String[] args) {
		Parent2 p=new Parent2();
		p.m2();
	//	p.m1();  //private members can't be access from outside the class
		Parent2 p1=new Child2();
		p1.m2();
		//p1.m1(); // private members can't be access from outside the class
	}
}

/**
In java we can increase the visibility of members but we can not decrease it
(private----> default or protected or public), not possible(public ---> default or private or protected)

private member of parent class can't be overriden


*/
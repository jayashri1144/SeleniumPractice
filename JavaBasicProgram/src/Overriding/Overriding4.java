package Overriding;
//Base Class or parent class or Super class
class Parent{
	void show() {
		System.out.println("show() method of Parent");
	}
}
//Inherited class or child class or sub class
class Child extends Parent{
	// This method overrides show() of Parent
	@Override
	void show() {
		System.out.println("show() method of child");
	}
}
//Driver class

public class Overriding4 {

	public static void main(String[] args) {
		// If a Parent type reference refers to a Parent object, then Parent's show is called
		Parent p=new Parent();
		p.show(); //Parent's show()
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
		// POLYMORPHISM.
		Child c=new Child();
		c.show(); //Child's show()
     }
}

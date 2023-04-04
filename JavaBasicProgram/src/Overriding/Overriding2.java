package Overriding;

class Human{
	// Overridden method
		//in overriding we can increase the visibility of overrided method --> private -->default-->protected-->public
		// default ---> protected or public
		// protected ---> public
		// public ----> public
		// NOTE: private method never get overrided
	void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human{
	//overriding method
	public void eat() {
		System.out.println("boy is eating");
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		Boy b=new Boy();
		b.eat();
		
		Human h=new Human();
		h.eat();
	}

}

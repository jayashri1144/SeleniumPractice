package Overriding;

class Animal{
	public void move() {
		System.out.println("Animal can move");
	}
}

class Dogs extends Animal{
	public void move() {
		System.out.println("dogs can run and walk");
	}
	public void bark() {
		System.out.println("dogs can barks");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Animal a=new Animal();// Animal reference and object
		a.move();
		
		Dogs s=new Dogs();// Animal reference but Dog object
		s.bark();
		s.move();
		
		Animal a1=new Dogs();// you will get dog class move(), bark()
		a1.move();
	//	a1.bark(); // a1 compile time error since b's reference type Animal doesn't
		
	}

}

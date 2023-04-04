package practiceProgram;

public class Classbody {
	
	//Global variable static and non-static
	static int age;
	double salary;
	
	//method or function-- can have static or non-static method
	public static void display() {
		System.out.println("I am static method");
	}

	public void print() {
		System.out.println("I am non-static method");
	}
	
	//constructor-- can have overloading constructor
	public Classbody()
	{
		System.out.println("I am zero parameterised constructor of classbody");
	}
	
	//block: can have static or non-static blocks
	static
	{
		int age=28;
		System.out.println("I am static initialization blocks or SIB");
	}
	
	{
		System.out.println("I am non-static initialization blocks or IIB");
	}
	
	public static void main(String[] args) {
		
		//local variable
		int number;
		display();  //static method
		
		//non-static method 
		Classbody nonStaticMethodObj= new Classbody();
	    nonStaticMethodObj.print();
		
	}

}

package Constructors;

public class Thiskeyword3 {

	int age;
	void call() {
		System.out.println("I am call method");
	}
	
	void m(int age)
	{
		System.out.println("Local age: "+age);
		System.out.println("Global age: "+this.age);
		//call();
		this.call();
		System.out.println("this keyword value is: "+this); //print same reference ID
	}
	
	public static void main(String[] args) {
		
		Thiskeyword3 t1=new Thiskeyword3();
		System.out.println("object t1 value is: "+t1); //prints the reference ID
		t1.m(56);
	}

}

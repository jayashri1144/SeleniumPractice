package Constructors;

public class StaticLocalGlobal {

	static int age=25;
	public static void main(String[] args) {
		
		int age=30;
		System.out.println("I am local variable: "+age);
		System.out.println("I am global variable: "+StaticLocalGlobal.age);
		

	}

}

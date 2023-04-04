package conditions;

/**
 * Constructor Overloading: more than on constructor in a class
 * Rule:
 * 1. type of args different
 * 2. number of arguments are different
 * 3. position of args different
 */

public class Cons3 {
	
	Cons3()
	{
		System.out.println("This is a zero-para constructor ");
	}
	
	public Cons3(char c)
	{
		System.out.println("This is a single para constructor");
	}
	
	Cons3(int num1, int num2)
	{
		System.out.println("This is a int-int parameterized constructor");
	}
	
	Cons3(double num1, int num2)
	{
		System.out.println("This is a double-int para constructor");
	}

	Cons3(int num1, double num2)
	{
		System.out.println("This is a int-double para constructor");
	}
	
	public static void main(String[] args) {
		
		Cons3 obj=new Cons3();
		Cons3 obj1=new Cons3('c');
		Cons3 obj2=new Cons3(10,10);
		Cons3 obj3=new Cons3(10d,20);
		Cons3 obj4=new Cons3(23,5.7);

	}

}

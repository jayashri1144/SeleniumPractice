package methods;

public class MethodOverloding {
	/**
	 * Method Overloading: any method declare more than once in class body with anyone of below rules:
	 * 1. type of argument different or
	 * 2. number of arguments/parameter should different or
	 * 3. position of argument/parameter should different
	 */
	
	static double res;
	static public void square() {
		System.out.println("No parameter method called.");
	}

	static public void square(int number)
	{
		res=number*number;
		System.out.println("Method with Integer Argument Called:" +res);
	}

	static public void square(double number)
	{
		res=number*number;
		System.out.println("Method with double argument called: " +res);
	}
	
	public static void main(String[] args) {
		
		MethodOverloding.square();
		MethodOverloding.square(5);
		MethodOverloding.square(2.5);
	}

}

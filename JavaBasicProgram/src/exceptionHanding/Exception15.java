package exceptionHanding;

public class Exception15 {

	static void mathod() {
		System.out.println("Inside the method()");
		throw new ArithmeticException("Throwing Arithmatic exception");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			mathod();
		}
		catch(ArithmeticException e) {
			System.out.println("caught in main method");
		}
		System.out.println("rest of the code");
	}

}

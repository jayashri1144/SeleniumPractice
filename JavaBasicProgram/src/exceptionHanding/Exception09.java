package exceptionHanding;

public class Exception09 {

	public static void validateAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible.");
		}
		else
		{
			System.out.println("Person is eligible to vate!!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Main start");
	try {
		validateAge(1);
		System.out.println("Exception not found");
	}
	catch(ArithmeticException e) {
		System.out.println("Exception handled");
	}
	System.out.println("rest of the code");
	}

}

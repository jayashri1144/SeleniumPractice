package exceptionHanding;

public class Exception10 {

	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible");
		}
		else
		{
			System.out.println("Person is eligible to vote.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start programs");
		validate(19);
		System.out.println("rest of the code");
	}

}

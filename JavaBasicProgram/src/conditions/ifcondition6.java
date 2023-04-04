package conditions;

public class ifcondition6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=50;
		if(number%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
		checkEvenOddNumber(150);
		System.out.println(isNumberEven(150));
		
		//static method with argument/parameter and return type as void.	
	}

	 	static void checkEvenOddNumber(int number) {
		if(number%2==0)
		{
			System.out.println("given number is even number: " +number);
		}
		else
		{
			System.out.println("Given number is odd number: " +number);
		}
		
	}
	
	//static method with argument and return type as boolean
	 	static boolean isNumberEven(int number)
	 	{
	 		if(number%2==0)
	 		{
	 			return true;
	 		}
	 		else
	 		{
	 			return false;
	 		}
	 	}

}

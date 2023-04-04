package methods;

public class StaticMethod2 {

	public static void main(String[] args) {
		
		// create a method to add two number
		addTwoNumber(10, 10);
		
		//System.out.println(addTwoNumber(10, 20));
		//error: we can't use method with return type as void inside println()
		System.out.println("");
		//TODO create a method to multiple two number and add 100 on the result.
		
		//multiTwoNumber(20, 30); //method will be executed but we won't be able 
		// to print it's return value in the console.
		//or
		int res=StaticMethod2.multiTwoNumber(10, 20);
//method body will be executed & also its return in stored in a variable
		//for future use
		int finalValue=res+100;
		System.out.println("Final value is " +finalValue);

	}
	
	static int multiTwoNumber(int n1,int n2)
	{
		System.out.println("num1 " +n1);
		System.out.println("num2 " +n2);
		int res=n1*n2;
		return res;
	}

	static void addTwoNumber(int num1, int num2)
	{
		System.out.println("Number1 :" +num1);
		System.out.println("Number2 :" +num2);
		int res=num1+num2;
		System.out.println("res :" +res);
	}
}

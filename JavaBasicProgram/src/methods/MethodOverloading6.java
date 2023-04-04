package methods;
/**
 * what if return type, method name AND argument list are same.
 */
public class MethodOverloading6 {
	
	public int myMethod(int num1, int num2)
	//public double myMethod(int num1, int num2)//return type are different. method name & argument list same
	{
		System.out.println("first method");
		return num1+num2;
	}
	
//	public int myMethod(int var1, double var2)
//	{
//		System.out.println("second method");
//		return var1-var2;
//	}

	public static void main(String[] args) {
		
		MethodOverloading6 m=new MethodOverloading6();
		m.myMethod(10, 10);
		m.myMethod(20, 20);

		
	}

}

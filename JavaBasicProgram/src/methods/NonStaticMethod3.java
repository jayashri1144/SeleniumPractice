package methods;

public class NonStaticMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod3 n1=new NonStaticMethod3();
		n1.swapTwoNumbers(234,789);
		
		n1.getQuotientAndRemainder(15,4);
		
		System.out.println("ASCII value of 'F': "+n1.ASCII('F'));
		
	}
	void swapTwoNumbers(int num1, int num2)
	{
		System.out.println("before swap num1: "+num1);
		System.out.println("before swap num2: "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("after swap num1: "+num1);
		System.out.println("after swap num2: "+num2);
	}
	
	void getQuotientAndRemainder(int n1, int n2)
	{
		int quotient=n1/n2;
		System.out.println("Quotient :" +quotient);
		int remainder=n1%n2;
		System.out.println("remainder :" +remainder);
		
	}
	
	int ASCII(char c)
	{
		return c;
	}
}

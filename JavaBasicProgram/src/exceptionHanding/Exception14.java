package exceptionHanding;

import java.util.Scanner;

public class Exception14 {
	public int divideNum(int m, int n)
	{
		int div=m/n;
		return div;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception14 obj=new Exception14();
		Scanner scn=new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter two number");
		num1=scn.nextInt();
		num2=scn.nextInt();
		try {
			System.out.println(obj.divideNum(num1, num2));
		}
		catch(ArithmeticException e) {
			System.out.println("NUmber can not be devide by zero:"+e);
		}
		System.out.println("rest of the code");
	}

}

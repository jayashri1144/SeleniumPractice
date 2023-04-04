package Polymorphism;

public class CompileTime {

	static void sum(int a,int b)
	{
		int c= a+b;
		System.out.println("sum of two number:"+c);
	}
	static void sum(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println("sum of three number:"+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTime.sum(20, 30);

	}

}

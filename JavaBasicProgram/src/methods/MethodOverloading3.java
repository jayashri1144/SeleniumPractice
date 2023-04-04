package methods;


class adder{
	static int add(int a, int b)
	{
		return a+b; 
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

public class MethodOverloading3 {

	public static void main(String[] args) {
		System.out.println(adder.add(25, 25));
		System.out.println(adder.add(1,4,6));
		
		MethodOverloding.square();
		//even you can access static member from other source file as well
	}

}

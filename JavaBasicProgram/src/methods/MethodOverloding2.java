package methods;

public class MethodOverloding2 {
	
	public void add()
	{
		System.out.println("Method with no parameter");
	}

	public void add(int number)
	{
		int res=number+number;
		System.out.println("method with integer argument/parameter " +res);
	
	}
	
	public void add(float num)
	{
		float num1= num * num;
		System.out.println("method with float argument/parameter " +num1);
	}
	
	public static void main(String[] args) {

		MethodOverloding2 obj=new MethodOverloding2();
		obj.add();
		obj.add(45);
		obj.add(2.7f);
		
	}

}

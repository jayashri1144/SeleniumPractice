package methods;

public class MethodOverloading5 {
	
	void disp(int a,double  b)
	{
		System.out.println("Method A");
	}
	
	void disp(int a,float b)
	{
		System.out.println("Method B");
	}
	
	void disp(float a, int b)
	{
		System.out.println("Method C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading5 m1=new MethodOverloading5();
		m1.disp(200, 2.5);
	}

}

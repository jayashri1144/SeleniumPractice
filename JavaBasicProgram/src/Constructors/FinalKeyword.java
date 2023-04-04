package Constructors;

/**
 * anything declared with final keyword known as constant.
 * any variable declared with final keyword should initialize at the same time. 
 * 
 */
public class FinalKeyword {


	final int empId=90;
	double salary= 90000.00;
	void run()
	{
		System.out.println("empId: "+empId);
	}
	
	public static void main(String[] args) {
		
		FinalKeyword f=new FinalKeyword();
		f.run();
		System.out.println(f.salary);
		
//		final int age=50;
//		System.out.println("age: "+age);
//		//age=90;
//		System.out.println("age: "+age);
//		//age=60;
//		System.out.println("age: "+age);
//		
		
	}
}

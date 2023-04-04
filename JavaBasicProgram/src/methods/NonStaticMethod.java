package methods;

public class NonStaticMethod {

	public static void main(String[] args) {
		//to access non-static member create an instance of the class
		
		NonStaticMethod m1=new NonStaticMethod();
		m1.displayPersonlInfo();
		System.out.println("");
		m1.displayPersonlInfo();
		
		//when you want to display information with Dynamic values
		m1.displayPersonalInfo("sushilkumar","automation","pune");
		
		//execution calling method
		m1.calling(12345);
		m1.calling(2345);
		int i=98765;
		m1.calling(i);
		
	}
	public void displayPersonlInfo() {
		System.out.println("anvi");
		System.out.println("good girl");
		System.out.println("pune");
	}
	
	public void displayPersonalInfo(String name, String prof, String location)
	{
		System.out.println("Hi, I am " +name);
		System.out.println("I am your "+prof+" trainer");
		System.out.println("I am from "+location);
	}
	
	public void calling(int num)
	{
		System.out.println("hi, i am xyz");
		System.out.println("calling using number: " +num);
	}
}

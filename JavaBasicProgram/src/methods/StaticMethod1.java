package methods;

public class StaticMethod1 {

	public static void main(String[] args) {
		
		System.out.println("I am jay");
		System.out.println("from pune");
		System.out.println("software testing");
		System.out.println("");
		
		displayPersonalInfo();
		System.out.println("");
		
		displayPersonalInfo();
		System.out.println("");
		
		displayPersonalInfo("anvi","automation","pune");
		System.out.println();
		
		//calling(65000);
		int i=65444;
		calling(i);
		

	}
	public static void displayPersonalInfo() {
		System.out.println("i ma jay");
		System.out.println("from bhadgaon");

	}
	
	public static void displayPersonalInfo(String name,String prof,String location)
	{
		System.out.println("hi, I am " +name);
		System.out.println("i am your "+prof+ " trainer");
		System.out.println("from "+location);
	}

	public static void calling(int num) {// int num=i=65000
		System.out.println("hi, i am preksha");
		System.out.println("calling using number: " +num);
	}
}

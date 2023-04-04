package ObjectClass;

class demo{
	void display() {
		System.out.println("I am display() method of demo class.");
	}
}
public class Example1 extends demo{

	static int last_roll=100;
	int roll_no;
	//constructor
	Example1(){
		roll_no = last_roll;
		last_roll++;
	}
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d1=new demo();
		System.out.println(d1);
		
		demo d2=new demo();
		System.out.println(d2.toString());
		System.out.println("=====================");
		
		Example1 e1=new Example1();
		//below two statement are equivalent;
		System.out.println(e1);
		
		System.out.println(e1.toString());
		System.out.println("=========================");
		
		demo d3=new Example1();
		System.out.println(d3);
		
		System.out.println("=========================");
		System.out.println(new Example1());
		

	}

}
/**
 * string representation---> fullyqualifiedclassname@hexadecimaladdress	
 * 							 packagename.classname@hexadecimaladdress
 * 
 */

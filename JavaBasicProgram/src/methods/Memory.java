package methods;

public class Memory {
	static int salary;
	int empId;
	void display()
	{
		System.out.println("I am doslay()...");
	}
	static void print()
	{
		System.out.println("I am print()...");
	}
	

	public static void main(String[] args) 
	{
		//access static members---> static variable and method
		System.out.println("static variable salary: " +Memory.salary);
		Memory.print();
		
		//access non static members--->non-static variable and method
		Memory m1=new Memory();
		System.out.println("non-static variable empId: "+m1.empId);
		m1.display();
		
		//update static member
		Memory.salary=90000;
		System.out.println("update static member: "+Memory.salary);
		
		//update non-static member
		m1.empId=209;
		System.out.println("update non-static member: "+m1.empId);
		
		Memory m2=new Memory();
		System.out.println("2nd instance non-static variable empId: "+m2.empId);
		m2.display();

		
	}

}

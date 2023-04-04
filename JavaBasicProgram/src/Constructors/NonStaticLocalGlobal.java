package Constructors;

import practiceProgram.Classbody;

public class NonStaticLocalGlobal {

	int empId=90;
	public static void main(String[] args) {
		
		NonStaticLocalGlobal n1=new NonStaticLocalGlobal();
		n1.display();
		
		Classbody c1= new Classbody();
		c1.print();
		Classbody.display();

	}
	void display()
	{
		int EmpId=45;
		System.out.println("I am local empId: "+EmpId);
		System.out.println("I am global empId: "+empId);
	}

}

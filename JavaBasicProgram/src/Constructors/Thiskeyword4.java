package Constructors;

public class Thiskeyword4 {
	int variable = 5;
	int age=10;
	

	public static void main(String[] args) {
	
		Thiskeyword4 t1=new Thiskeyword4();
		t1.method(2);
		t1.method();
		System.out.println("obj GV variable: "+t1.variable);
		Thiskeyword4 t2=new Thiskeyword4();
		System.out.println("obj2 GV variable: "+t2.variable);
		
	}
	
	void method(int variable)
	{
		System.out.println("value of local variable:"+variable);
		variable=10;
		
		System.out.println("value of variable: "+ variable);
		System.out.println("GV value of variable: "+ this.variable);
		this.variable=variable;
		System.out.println("value of variable: "+variable);
		System.out.println("GV value of variable: "+this.variable);
	}
	void method() {
		int variable=45;
		System.out.println("value of Instance variable: "+this.variable);
		System.out.println("value of local variable "+variable);
		this.variable=variable;
		System.out.println("value of local variable: "+variable);
		System.out.println("value of Instance variable: "+this.variable);
		
	}

	
}

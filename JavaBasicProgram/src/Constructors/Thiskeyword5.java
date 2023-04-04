package Constructors;

public class Thiskeyword5 {

	int a,b;
	//parameterized constructor
	Thiskeyword5(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println("a = "+ a +"b=" +b);
	}
	
	public static void main(String[] args) {
		
		Thiskeyword5 t1=new Thiskeyword5(10, 20);
		t1.display();
		System.out.println(t1.a+" "+t1.b);
		Thiskeyword5 t2=new Thiskeyword5(102, 103);
		t2.display();
		System.out.println(t2.a+" "+t2.b);
	}

}

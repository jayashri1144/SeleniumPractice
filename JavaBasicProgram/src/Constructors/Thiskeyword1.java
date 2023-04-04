package Constructors;

class Thiskey
{
	int rollno;
	float fee;
	public Thiskey(int rollno, float fee) {
		System.out.println("local variable: "+rollno);
		System.out.println("local variable: "+fee);
		System.out.println("Global variable: "+this.rollno);
		System.out.println("global variable: "+this.fee);
		this.rollno= rollno;
		this.fee=fee;
	}
	
	void display()
	{
		System.out.println(rollno+ " " +fee);
	}
}

public class Thiskeyword1 {

	public static void main(String[] args) {
		
		Thiskey t1=new Thiskey(11, 23000);
		t1.display();
		
		Thiskey t2=new Thiskey(34, 90000);
		t2.display();
	}
}

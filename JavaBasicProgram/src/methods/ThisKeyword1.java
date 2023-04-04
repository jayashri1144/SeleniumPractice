package methods;

class Student1 {
	//global variable
	int rollno;
	float fee;
	Student1(int rollno, float fee)
	{
		System.out.println("local rollno : "+rollno);
		System.out.println("local fee : "+fee);
		System.out.println("initial global rollno : " +this.rollno);
		System.out.println("intialglobal fee : "+this.fee);
		//global Var= Local Var;
		this.fee=fee;
		this.rollno=rollno;
		System.out.println("after update, global rollno : "+this.rollno);
		System.out.println("after update, initial global fee :"+this.fee);
	}
	
	void display()
	{
		System.out.println(rollno + " " + fee);
	}
}

public class ThisKeyword1 {

	public static void main(String[] args) {
		
		Student1 s1= new Student1(111, 500f);
		s1.display();
		Student1 s2= new Student1(112, 6000f);
		s2.display();
		

	}

}

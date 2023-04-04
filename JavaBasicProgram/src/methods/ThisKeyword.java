package methods;

class Student {
	int rollno;
	float fee;
	Student(int rollno, float fee)
	{
		rollno = rollno;
		fee = fee;
	}
	void display() {
		System.out.println(rollno + "" + fee);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		Student s1=new Student(111, 500f);
		s1.display();
		Student s2=new Student(112, 546f);
		s2.display();

	}

}

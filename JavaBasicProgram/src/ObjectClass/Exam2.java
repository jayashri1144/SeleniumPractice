package ObjectClass;

public class Exam2 extends demo{
	
	static int last_roll = 100;
	int roll_no;
	//constructor
	Exam2(){
		roll_no = last_roll;
		last_roll++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam2 s=new Exam2();
		// Below two statements are equivalent
		System.out.println(s);//s.toString() -->string representation of an object
		System.out.println(s.toString());//string representation of an object
		System.out.println(s.hashCode());//it convert hexadecimal address in to decimal and return the value
		demo d1=new demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
	}

}

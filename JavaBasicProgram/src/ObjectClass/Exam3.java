package ObjectClass;
class demo123{
	void display() {
		System.out.println("I am display() of demo123");
	}
}
public class Exam3 extends demo123{
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Exam3()
    {
        roll_no = last_roll;//100
        last_roll++;//101
    }
	@Override
	void display() {
		System.out.println("I am dispaly of class Object class");
	}
	public int hashCode(){
		return roll_no;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam3 e=new Exam3();
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println("hashcode() value from objectClass: "+e.hashCode());
		e.display();
		demo123 d=new demo123();
		d.display();
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println("hashcode() value from demo123() "+d.hashCode());
	}

}

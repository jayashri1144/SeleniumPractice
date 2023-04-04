package string;

final class Testing{
	final int age;
	final double salary;
	final String name;
	
	Testing(int a,double b,String c){
		age=a;
		salary=b;
		name=c;
	}
	
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println(age);
		System.out.println(salary);
		System.out.println(name);
	}
}

public class ImmutableClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing t=new Testing(12, 3500000,"Anvi");
		t.display();

	}

}

package Encapsulations;
class sample2{
	private int salary=34000;
	
	void setSalary(int salary) {
		this.salary=salary;
	}
}

public class WriteOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample2 obj=new sample2();
		obj.setSalary(23000);
		

	}

}

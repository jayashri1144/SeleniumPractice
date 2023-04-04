package Encapsulations;
class Encap{
	private int pinCode=4110;
	private double salary=45000;
	private char grade='A';
	/*implement getter method to access these private data members from outside the class
	 * to write getter method, create a public method with return type as private variable datatype
	 */
	public int getPinCode() {
		return pinCode;
	}
	public char getGrade() {
		return grade;
	}
	public double getSalary() {
		return salary;
	}
	/* setter method will help you to access private data members from outside the class
	 * create a public method with void as return type and argument should match with you private variable datatype
	 */
	public void setPinCode(int pin) {
		pinCode=pin;
	}
}

public class encap3 {

	public static void main(String[] args) {
	Encap e2=new Encap();
	System.out.println(e2.getPinCode());
	System.out.println(e2.getSalary());
	System.out.println(e2.getGrade());
	e2.setPinCode(45);
	System.out.println(e2.getPinCode());
	
	}
}

package Inheritance;
class company102{
	void display() {
		System.out.println("I am compnay class display");
	}
}

class employee101 extends company102{
	void display() {
		System.out.println("I am employee class display");
		super.display();
	}
	void callme() {
		System.out.println("I am employee class callme");
	}
	
}
public class Inheritance7 {

	public static void main(String[] args) {
		employee101 e=new employee101();
		e.callme();
		e.display();
		System.out.println("==================================");
		company102 c=new company102();
		c.display();
		System.out.println("=================================");
		company102 e2=new company102();
		e2.display();

	}

}


package Interfaces;

interface Printable2 {
	void print();
}
interface Showable2 extends Printable2 {
	void show();
	//public abstract void print(); ---> inherited method/virtual method
}
class Interface4 implements Showable2 {
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String args[]) {
		Interface4 obj = new Interface4();
		obj.print();
		obj.show();
		Printable2 obj2 = new Interface4();
		obj2.print();
		//obj2.show();
	}
}

//Printable<____________showable <------------Interface4
